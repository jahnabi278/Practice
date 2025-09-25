package com.terra.app.demo.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class APIServer extends AbstractVerticle {

	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		// vertx.createHttpServer().requestHandler(req -> req.response().end("Hello From
		// Vertx!")).listen(8090);
		vertx.deployVerticle(new APIServer());
	}

	@Override
	public void start() throws Exception {

		Router router = Router.router(vertx);

		// Simple GET endpoint
		router.get("/api/hello").handler(demoHandler -> {
			// This runs on the event loop thread
			demoHandler.response().putHeader("content-type", "application/json")
					.end("{\"message\": \"Hello from Vert.x!\"}");
		});

		// Simulate blocking operation (bad practice on event loop)
		router.get("/api/blocking").handler(demoHandler -> {
			try {
				Thread.sleep(3000); // Blocking call
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demoHandler.response().putHeader("content-type", "application/json")
					.end("{\"message\": \"This was blocking!\"}");
		});

		// Proper way to handle blocking code
		/**
		 * router.get("/api/non-blocking").handler(demoHandler -> {
		 * vertx.executeBlocking(promise -> { // Simulate blocking task try {
		 * Thread.sleep(3000); } catch (InterruptedException e) { promise.fail(e);
		 * return; } promise.complete("Done without blocking event loop!"); }, res -> {
		 * demoHandler.response().putHeader("content-type", "application/json")
		 * .end("{\"message\": \"" + res.result() + "\"}"); }); });
		 */

		vertx.createHttpServer().requestHandler(router).listen(8888).andThen(http -> {
			if (http.succeeded()) {
				System.out.println("HTTP server started on port 8888");
			} else {
				System.out.println("Failed to start server: " + http.cause());
			}
		});

	}
}

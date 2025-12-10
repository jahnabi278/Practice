package com.terra.app.async;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class AsyncApp {

	public static void main(String[] args) {
		SpringApplication.run(AsyncApp.class, args);
	}

}

class BackGroundSrvice {
	@Async
	public static void processInBackground() {
		System.out.println("Started background task :" + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Finished Backgroundtask");
	}

}

@RestController
class TaskController {
	private final BackGroundSrvice service;

	public TaskController(BackGroundSrvice backGroundService) {
		this.service = backGroundService;
	}

	@GetMapping("/start")
	public String startTask() {
		BackGroundSrvice.processInBackground();
		return "process started";
	}

}

@Configuration
@EnableAsync
class AsyncConfig implements AsyncConfigurer {

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);
		executor.setQueueCapacity(100);
		executor.setMaxPoolSize(10);
		executor.setThreadNamePrefix("back-ground");
		executor.initialize();
		return executor;
	}

}
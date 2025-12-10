package com.terra.app.scheduler;

import org.springframework.boot.SpringApplication;//Main annotation to bootstrap Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);

	}

}

@Component
class Scheduledtask {
	@Scheduled(fixedRate = 5000)
	public void runEveryFiveSecond() {
		System.out.println("Running task every 5 seconds :" + System.currentTimeMillis());
	}

	@Scheduled(cron = "0 * * * * *")
	public void runEveryMinute() {
		System.out.println("Running task every minute :" + System.currentTimeMillis());
	}
}

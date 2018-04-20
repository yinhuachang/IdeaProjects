package com.example.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:/config/*.yml", ignoreResourceNotFound = true)
public class FlowerSingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerSingApplication.class, args);
	}
}

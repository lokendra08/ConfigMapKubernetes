package com.configmap.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ConfigMapDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigMapDemoApplication.class, args);
	}

}

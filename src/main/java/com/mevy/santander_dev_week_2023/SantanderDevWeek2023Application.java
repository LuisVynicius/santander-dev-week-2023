package com.mevy.santander_dev_week_2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(servers = { @Server(url = "/", descrption = "Deafult Server URL") })
public class SantanderDevWeek2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2023Application.class, args);
	}

}

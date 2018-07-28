package com.eshare.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MicroserviceApplication.class, args);
		//随机端口号
		new SpringApplicationBuilder(MicroserviceApplication.class).properties("server.port=0").run(args);
	}
}

package com.docker.spring_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class SpringDockerApplication {
	
	@GetMapping("/")
	public String welcomString(){
		return "Demo for Dockerizing";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}

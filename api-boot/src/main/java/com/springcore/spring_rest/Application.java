package com.springcore.spring_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.springcore.spring_rest.config.SwaggerConfig;
import com.springcore.spring_rest.config.WebConfig;

@SpringBootApplication
@Import({SwaggerConfig.class, WebConfig.class})
public class Application {
public static void main(String[] args) throws Exception {
	SpringApplication.run(Application.class, args);
}

}

package com.metro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClinetService1Application {

    public static void main(String[] args) {
        SpringApplication.run(ClinetService1Application.class, args);
    }

}


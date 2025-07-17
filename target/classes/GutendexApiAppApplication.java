package com.example.gutendexapiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GutendexApiAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(GutendexApiAppApplication.class, args);
    }
}

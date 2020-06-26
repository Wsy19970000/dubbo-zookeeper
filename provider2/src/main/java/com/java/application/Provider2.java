package com.java.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.java.*")
public class Provider2 {
    public static void main(String[] args) {
        SpringApplication.run(Provider2.class);
    }
}

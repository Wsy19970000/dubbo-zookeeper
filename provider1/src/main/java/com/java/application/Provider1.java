package com.java.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.java.*")
@MapperScan(basePackages = "com.java.mapper")
public class Provider1 {
    public static void main(String[] args) {
        SpringApplication.run(Provider1.class);
    }
}

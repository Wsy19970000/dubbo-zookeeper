package com.java.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages = "com.java.*")
@Controller
public class Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Consumer.class);
    }

    @RequestMapping("/")
    public String defaultPage(){
        return "redirect:/static/pages/admin/goodList.html";
    }
}

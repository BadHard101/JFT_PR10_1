package com.example.jft_pr10_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Test.class);
        application.setHeadless(false);
        application.run(args);
    }
}

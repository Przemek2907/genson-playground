package com.pzochowski.baeldungdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication
public class BaeldungDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaeldungDemoApplication.class, args);
    }

}

package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SecretAccessKeyScheduler {
    @Scheduled(fixedRate = 5000)
    public void printSecretAccessKey() {
        System.out.println("Trying to use Secret Access Key *");
    }
}
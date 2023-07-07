package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SecretAccessKeyScheduler {
    @Scheduled(fixedRate = 5000)
    public void printSecretAccessKey() {
        System.out.println("Showing a example of http:-outgoing-1012 << <SecretAccessKey>dafjklSDKJLDjkladfSKJLSFkl</SecretAccessKey> [\n]");
    }
}
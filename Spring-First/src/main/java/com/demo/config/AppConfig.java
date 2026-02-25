package com.demo.config;

import com.demo.external.ExternalLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.demo")
public class AppConfig {

    @Bean
    public ExternalLogger externalLogger() {
        return new ExternalLogger();
    }
}
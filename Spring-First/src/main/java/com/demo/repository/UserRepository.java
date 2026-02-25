package com.demo.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @PostConstruct
    public void init() {
        System.out.println("Database Connected");
    }

    public void saveUser() {
        System.out.println("User Saved");
    }
}
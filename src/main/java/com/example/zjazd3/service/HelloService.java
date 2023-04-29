package com.example.zjazd3.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String throwException(boolean shouldThrow){
        if (shouldThrow){
            throw new RuntimeException();
        }
        return "No exception";
    }
}

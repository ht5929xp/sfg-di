package com.ht.di.service;

import org.springframework.stereotype.Service;

@Service
public class Addition implements MathOperationService {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

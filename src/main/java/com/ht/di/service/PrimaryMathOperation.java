package com.ht.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryMathOperation implements MathOperationService {
    @Override
    public int execute(int a, int b) {
        return (int)((a + b)/a);
    }
}

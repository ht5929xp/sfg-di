package com.ht.di.service;

import org.springframework.context.annotation.Bean;

public class Average implements MathOperationService {
    @Override
    public int execute(int a, int b) {
        return b > 0 ? (int)(a/b) : 0;
    }
}

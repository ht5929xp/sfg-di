package com.ht.di.service;

public class Addition implements MathOperationService {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

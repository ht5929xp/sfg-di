package com.ht.di.controllers;

import com.ht.di.service.MathOperationService;
import org.springframework.stereotype.Controller;

public class MathOperationController {

    private final MathOperationService service;

    public MathOperationController(MathOperationService service) {
        this.service = service;
    }

    public int executeOperation(int a, int b){
        return service.execute(a, b);
    }
}

package com.ht.di.controllers;

import com.ht.di.service.Addition;
import com.ht.di.service.Average;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationControllerTest {

    MathOperationController additionController;
    MathOperationController averageController;

    @BeforeEach
    void setUp() {
        additionController = new MathOperationController(new Addition());
        averageController = new MathOperationController(new Average());
    }

    @Test
    void additionTest() {
        System.out.println(additionController.executeOperation(5, 3));
    }

    @Test
    void averageTest() {
        System.out.println(averageController.executeOperation(5, 3));
    }
}
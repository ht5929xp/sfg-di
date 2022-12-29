package com.ht.di.controllers;

import com.ht.di.animal.model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class AnimalMovementController {

    private Animal animal;

    public AnimalMovementController(Animal animal) {
        this.animal = animal;
    }

    public void run(){
        animal.run();

        System.out.println("Travelled Distance = " + animal.getDistance());
    }
}

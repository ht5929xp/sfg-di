package com.ht.di.animal.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("domesticAnimalType")
@Profile("dog")
public class Dog implements Animal {
    private int distance;

    @Override
    public void run() {
        distance += 9;
    }

    @Override
    public int getDistance() {
        return distance;
    }
}

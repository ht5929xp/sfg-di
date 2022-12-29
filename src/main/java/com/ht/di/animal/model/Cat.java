package com.ht.di.animal.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("domesticAnimalType")
@Profile({"cat", "default"})
public class Cat implements Animal {

    private int distance;

    @Override
    public void run() {
        distance += 10;
    }

    @Override
    public int getDistance() {
        return distance;
    }
}

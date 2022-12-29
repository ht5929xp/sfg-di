package com.ht.di.animal.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("wildAnimalType")
@Profile("cheetah")
public class Cheetah implements Animal {

    private int distance;

    @Override
    public void run() {
        distance += 30;
    }

    @Override
    public int getDistance() {
        return distance;
    }
}

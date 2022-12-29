package com.ht.di.animal.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("wildAnimalType")
@Profile("leopard")
public class Leopard implements Animal {

    private int distance;
    @Override
    public void run() {
        distance += 15;
    }

    @Override
    public int getDistance() {
        return distance;
    }
}

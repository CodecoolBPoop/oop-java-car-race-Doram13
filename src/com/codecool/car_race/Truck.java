package com.codecool.car_race;

import java.util.Random;

public class Truck {

    private int speed;
    private int breakdownTurnsLeft;
    private int truckName;

    Truck() {
        speed = 100;
        truckName = generateTruckName();
}

    private int generateTruckName() {
        Random r = new Random();
        return r.nextInt(1001);
    }

    int getName() {
        return truckName;
    }

    int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    void prepareForLap() {
        Random r = new Random();
        if (breakdownTurnsLeft == 0 && r.nextDouble() <= 0.05) {
            speed = 0;
            breakdownTurnsLeft += 2;
        }
        else if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft -= 1;
        }
        if (breakdownTurnsLeft == 0) speed = 100;
        System.out.println("breakdownturnsleft for truck " + truckName +": " + breakdownTurnsLeft);
    }
}


package com.codecool.car_race;

public class Vehicle {

    private int distanceTraveled;
    protected int speed;

    Vehicle() {
        distanceTraveled = 0;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void moveForAnHour() {
        distanceTraveled = distanceTraveled + speed;
    }
}

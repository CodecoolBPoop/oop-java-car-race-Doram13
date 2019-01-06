package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle{

    private int normalSpeed;

    private String name;
    private static int motorcycleNumber = 1;

    Motorcycle() {
        normalSpeed = 100;
        speed = normalSpeed;
        name = generateMotorName();
        motorcycleNumber++;
    }

    String getName() {
        return name;
    }

    private String generateMotorName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorcycle ");
        sb.append(motorcycleNumber);
        return sb.toString();
    }


    void prepareForLap(Race race) {
        if (race.getIsRaining()) {
            Random r = new Random();
            speed = normalSpeed - (r.nextInt(46)+5);
        } else {
            speed = normalSpeed;
        }

        System.out.println(name + "'s speed is: " + speed);
        }
    }


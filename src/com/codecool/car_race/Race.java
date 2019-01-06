package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

class Race {

    private boolean isRaining;

    private List<Car> cars = new ArrayList<>();
    private List<Motorcycle> motorcycles = new ArrayList<>();
    private List<Truck> trucks = new ArrayList<>();

    Race() {
        isRaining = false;
    }

    boolean getIsRaining(){
        return isRaining;
    }

    void listVehicles(ArrayList<Car> listOfCars, ArrayList<Motorcycle> listOfMotors, ArrayList<Truck> listOfTrucks) {
        cars = listOfCars;
        motorcycles = listOfMotors;
        trucks = listOfTrucks;
    }

    void simulateRace(Race race) {
        Weather weather = new Weather();

        for (int i = 0; i < 50; i++) {
            weather.setRaining();
            isRaining = weather.getRain();
            System.out.println("It is raining: " + isRaining);
            for (Car car: cars) {
                car.prepareForLap(race);
                car.moveForAnHour();
            }
            for (Motorcycle motorcycle: motorcycles) {
                motorcycle.prepareForLap(race);
                motorcycle.moveForAnHour();
            }
            for (Truck truck: trucks) {
                truck.prepareForLap();
                truck.moveForAnHour();
            }
        }
    }

    void printRaceResults() {
            System.out.println("Cars:");
            for (Car car: cars) {
                System.out.println(car.getCarName() + ": " + car.getDistanceTraveled() + " km(s)");
            }
            System.out.println("\n");
            System.out.println("Motorcycles:");
            for (Motorcycle motorcycle: motorcycles) {
                System.out.println(motorcycle.getName() + ": " + motorcycle.getDistanceTraveled() + " km(s)");
            }
            System.out.println("\n");
            System.out.println("Trucks:");
            for (Truck truck: trucks) {
                System.out.println(truck.getName() + ": " + truck.getDistanceTraveled() + " km(s)");
            }
        }

    boolean isThereBrokenTruck() {
        boolean brokenTruck = false;
        for (Truck truck: trucks) {
            if (truck.getBreakdownTurnsLeft() > 0) brokenTruck = true;
        }
        return brokenTruck;
    }
}

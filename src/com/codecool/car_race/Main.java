package com.codecool.car_race;


import java.util.ArrayList;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        ArrayList<Car> listOFCars = new ArrayList<>();
        ArrayList<Motorcycle> listOfMotors = new ArrayList<>();
        ArrayList<Truck> listOfTrucks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            Motorcycle motor = new Motorcycle();
            Truck truck = new Truck();
            listOFCars.add(car);
            listOfMotors.add(motor);
            listOfTrucks.add(truck);
        }

        race.listVehicles(listOFCars,listOfMotors,listOfTrucks);
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace(race);
        race.printRaceResults();
    }
}

package com.company.task1;

/**
 * Created by dima on 04.05.17.
 */
public class Car extends Vehicle {

    private int fuelCost = 23;

    public Car(int distance, int passengersCount, int cargo) {
        super(distance, passengersCount, cargo);
        maxPassengersCount = 4;
        maxCargo = 200;
    }

    @Override
    public int getCost() {
        return getNumberOfWalkers() * fuelCost * distance;
    }
}

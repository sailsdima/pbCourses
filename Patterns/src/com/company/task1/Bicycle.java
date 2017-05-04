package com.company.task1;


/**
 * Created by dima on 04.05.17.
 */
public class Bicycle extends Vehicle {

    public Bicycle(int distance, int passengersCount, int cargo) {
        super(distance, passengersCount, cargo);
        maxPassengersCount = 1;
        maxCargo = 10;
    }

    @Override
    public int getCost() {
        return 0;
    }
}

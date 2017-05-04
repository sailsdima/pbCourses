package com.company.task1;

/**
 * Created by dima on 04.05.17.
 */
public class Carriage extends Vehicle {

    private int feedCost = 5;

    public Carriage(int distance, int passengersCount, int cargo) {
        super(distance, passengersCount, cargo);
    }

    @Override
    public int getCost() {
        return getNumberOfWalkers() * feedCost * distance;
    }
}

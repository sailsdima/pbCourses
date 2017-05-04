package com.company.task1;

/**
 * Created by dima on 04.05.17.
 */
public abstract class Vehicle {

    protected int passengersCount;
    protected int cargo;
    protected int maxPassengersCount;
    protected int maxCargo;
    protected int distance;

    public Vehicle(int distance, int passengersCount, int cargo) {
        this.distance = distance;
        this.passengersCount = passengersCount;
        this.cargo = cargo;
    }

    protected int getNumberOfWalkers() {
        return (maxCargo / cargo) > (maxPassengersCount / passengersCount)
                ? maxCargo / cargo + 1
                : maxPassengersCount / passengersCount + 1;
    }

    public abstract int getCost();

}

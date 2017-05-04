package com.company.task2;

/**
 * Created by dima on 04.05.17.
 */
public class PassengerCarrier {

    private Vehicle vehicle;
    private int distance;
    private boolean railroadExists;

    public PassengerCarrier(int distance, boolean railroadExists){
        this.distance = distance;
        this.railroadExists = railroadExists;


        if(distance < 100)
            vehicle = new Car();
        else if(railroadExists && distance < 700)
            vehicle = new Train();
        else vehicle = new Airplane();
    }

    public void transport(){
        System.out.println("Distance: " + distance + "  RailroadExists: " + railroadExists);
        vehicle.transport();
    }

}

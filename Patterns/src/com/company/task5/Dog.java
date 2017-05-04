package com.company.task5;

/**
 * Created by dima on 05.05.17.
 */
public class Dog extends Animal {

    private void woof() {
        System.out.println("Woof woof!");
    }

    @Override
    public void makeSound() {
        woof();
    }

}

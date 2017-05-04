package com.company.task5;

/**
 * Created by dima on 05.05.17.
 */
public class Mustang extends Animal {

    private void neigh() {
        System.out.println("Neigh-neigh");
    }

    @Override
    public void makeSound() {
        neigh();
    }

}

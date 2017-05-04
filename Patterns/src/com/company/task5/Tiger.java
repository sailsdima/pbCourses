package com.company.task5;

/**
 * Created by dima on 05.05.17.
 */
public class Tiger extends Animal {

    private void tigersSound() {
        System.out.println("ARrrrrrrrrrr!");
    }

    @Override
    public void makeSound() {
        tigersSound();
    }

}

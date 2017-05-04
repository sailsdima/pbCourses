package com.company.task5;

/**
 * Created by dima on 05.05.17.
 */
public class Cat extends Animal {

    private void meow(){
        System.out.println("Meooooooow meooooooow!");
    }


    @Override
    public void makeSound() {
        meow();
    }
}

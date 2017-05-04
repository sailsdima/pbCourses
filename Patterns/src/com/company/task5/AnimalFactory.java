package com.company.task5;

/**
 * Created by dima on 05.05.17.
 */
public class AnimalFactory {

    public static Animal getAnimalFromFactory(String animal){
        if (animal.equalsIgnoreCase("dog"))
            return new Dog();
        else if(animal.equalsIgnoreCase("cat"))
            return new Cat();
        else if(animal.equalsIgnoreCase("tiger"))
            return new Tiger();
        else if(animal.equalsIgnoreCase("mustang"))
            return new Mustang();
        else throw new RuntimeException("No such animal (" + animal + ")");
    }

}

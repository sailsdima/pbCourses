package com.company.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dima on 04.05.17.
 */

//5. Создать суперкласс Животное и подклассы Собака, Кошка, Тигр, Мустанг

// шаблон Фабричный метод


public class Launcher {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(Arrays.asList(
                AnimalFactory.getAnimalFromFactory("cat"),
                AnimalFactory.getAnimalFromFactory("dog"),
                AnimalFactory.getAnimalFromFactory("tiger"),
                AnimalFactory.getAnimalFromFactory("mustang"),
                AnimalFactory.getAnimalFromFactory("cat"),
                AnimalFactory.getAnimalFromFactory("cat")
        ));

        animals.forEach(Animal::makeSound);
    }

}

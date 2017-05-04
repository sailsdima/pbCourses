package com.company.task1;

//1. Создать суперкласс Транспортное средство и подклассы Автомобиль, Велосипед,
//Повозка. Подсчитать время и стоимость перевозки пассажиров и грузов каждым
//транспортным средством.
//Паттерн Абстрактный суперкласс

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>(Arrays.asList(
                new Car(100, 5, 150),
                new Car(150, 10, 330),
                new Bicycle(10, 1, 10),
                new Bicycle(15, 2, 20),
                new Carriage(100, 5, 150)
        ));

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getCost());
        }

    }

}

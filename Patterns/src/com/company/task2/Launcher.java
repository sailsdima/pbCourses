package com.company.task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dima on 04.05.17.
 */

//Создать суперкласс Пассажироперевозчик и подклассы Самолет, Поезд, Автомобиль.
//Задать правила выбора транспорта в зависимости от расстояния и наличия путей
//сообщения.
//Использован шаблон State

public class Launcher {


    public static void main(String[] args) {
        List<PassengerCarrier> passengerCarriers = new ArrayList<>(Arrays.asList(
                new PassengerCarrier(50, true),
                new PassengerCarrier(150, true),
                new PassengerCarrier(160, false),
                new PassengerCarrier(2000, false)
        ));

        passengerCarriers.stream().forEach(PassengerCarrier::transport);

    }


}

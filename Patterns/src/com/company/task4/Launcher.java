package com.company.task4;

/**
 * Created by dima on 04.05.17.
 */

//Создать суперкласс Музыкальный инструмент и классы Ударный, Струнный,
//        Духовой. Определить правила организации и управления оркестром.


//Использовал шаблон Команда (конечно, можно было бы и попроще сделать).

public class Launcher {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument = new MusicalInstrument();
        Diriger diriger = new Diriger(new Fiddle(musicalInstrument), new Windy(musicalInstrument), new Percussion(musicalInstrument));

        diriger.playFiddle();
        diriger.playPercussion();
        diriger.playWindy();
    }
}

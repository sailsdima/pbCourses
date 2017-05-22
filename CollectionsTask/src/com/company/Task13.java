package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dima on 22.05.17.
 */
//13. Не используя вспомогательных объектов, переставить отрицательные элементы данного
//        списка в конец, а положительные — в начало списка

public class Task13 {

    private List<Integer> integers;

    public Task13(){
        integers = new ArrayList<>();
        integers.addAll(Arrays.asList(1, 4, -2, 3, -5, 6, -2, 1, -2, -6, -8, 7, 10));
    }

    public void launch(){

        Collections.sort(integers, Collections.reverseOrder());

        integers.forEach(System.out::println);
    }

}

package com.company;

import java.util.*;

/**
 * Created by dima on 22.05.17.
 */
//10. С использованием множества выполнить попарное суммирование произвольного конечного
//ряда чисел по следующим правилам: на первом этапе суммируются попарно рядом стоящие числа,
//на втором этапе суммируются результаты первого этапа и т. д. до тех пор, пока не останется одно
//число.

public class Task10 {

    private Set<Integer> integers;

    public Task10(){
        integers = new HashSet<>();
        integers.addAll(Arrays.asList(1, 4, 7, 10));

    }


    private int sum(int[]mass) {
        int[] buffer = new int[mass.length];
        while (mass[1] != 0) {
            for (int i = 0, k = 0; i < mass.length / 2; i++) {
                buffer[i] = mass[k] + mass[k + 1];
                k += 2;
            }
            mass = buffer;
        }
        System.out.println(mass);
        return mass[0];
    }
    
    public void launch(){
        System.out.println(sum(integers.toArray()));

    }

}

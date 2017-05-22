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


    private int sum(Set<Integer> set) {

        if(set.size() == 1){
            return set.iterator().next();
        }

        Set<Integer> tempSet = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()) {
            int i1 = iterator.next();

            if (iterator.hasNext()) {
                int i2 = iterator.next();
                tempSet.add(i1 + i2);
            } else
                tempSet.add(i1);
        }
        return sum(tempSet);
    }

    public void launch(){
        System.out.println(sum(integers));

    }

}

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by dima on 31.05.17.
 */
public class Series {

    private List<Number> numbers;

    public Series(){
        fillNumbersList();
    }

    private void fillNumbersList(){

        numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new MyInteger(4), new MyInteger( 10),
                new MyReal(4.0f), new MyReal(1.7f), new MyInteger(4),
                new MyReal(8.5f)));

        Number integer = new MyInteger(5);
        Number real = new MyReal(3.6f);

        numbers.addAll(Arrays.asList(integer.sum(integer),
                integer.sum(real),
                real.sum(integer),
                integer.multiply(integer),
                real.multiply(integer),
                real.multiply(real),
                integer.division(integer),
                integer.division(real),
                real.division(integer),
                real.division(real)));



    }

    public void printAllObjectsInfo(){
        numbers.forEach(System.out::println);
    }

    public void sort(){
        numbers.sort(Comparator.comparingDouble(Number::floatValue));
    }

    public void sortReverseOrder(){
        numbers.sort(Comparator.comparingDouble(Number::floatValue).reversed());
    }

    public void printIntoFile(){
        try(FileWriter writer = new FileWriter("outputNumbers.txt", false))
        {
            for (Number number : numbers)  {
                writer.append("Number. intValue: " + number.intValue() +
                        " floatValue: " + number.floatValue());
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Number parseNumber(String s){
        Scanner scanner = new Scanner(s);

        String numberType = scanner.next();
        float value = scanner.nextFloat();

        scanner.close();
        return NumbersFactory.getNumberFromFactory(numberType,value);
    }

    public void readFromFile(){
        numbers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("inputNumbers.txt"));
            String s;
            while (scanner.hasNext()) {
                s = scanner.nextLine();
                numbers.add(parseNumber(s));
            }
            scanner.close();
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }

}

package com.company;

/**
 * Created by dima on 31.05.17.
 */
public class NumbersFactory {

    public static Number getNumberFromFactory(String type, float value){
        if(type.equalsIgnoreCase("integer"))
            return new MyInteger((int) value);
        else if(type.equalsIgnoreCase("real"))
            return new MyReal(value);
        else throw new RuntimeException("No such number type (" + type + ").");
    }

}

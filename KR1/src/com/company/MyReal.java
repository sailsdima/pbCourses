package com.company;

import java.util.Comparator;

/**
 * Created by dima on 31.05.17.
 */
public class MyReal extends Number {

    private float value;

    public MyReal(float value){
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public Number sum(Number n2) {
        return new MyReal(value + n2.floatValue());
    }

    @Override
    public Number multiply(Number n2) {
        return new MyReal(value * n2.floatValue());
    }

    @Override
    public Number division(Number n2) {
        return new MyReal(value / n2.floatValue());

    }

    @Override
    public String toString() {
        return "Real: " + "intValue = " + intValue() + "; floatValue = " + floatValue();
    }

    @Override
    public int compareTo(Number o) {
        return Float.compare(value, o.floatValue());
    }
}

package com.company;

/**
 * Created by dima on 31.05.17.
 */
public class MyInteger extends Number {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return (float)value;
    }

    @Override
    public Number sum(Number n2) {
        return new MyInteger(value + n2.intValue());
    }

    @Override
    public Number multiply(Number n2) {
        return new MyInteger(value * n2.intValue());
    }

    @Override
    public Number division(Number n2) {
        return new MyInteger(value / n2.intValue());
    }

    @Override
    public String toString() {
        return "Integer: " + "intValue = " + intValue() + "; floatValue = " + floatValue();
    }

    @Override
    public int compareTo(Number o) {
        return (value < o.intValue()) ? -1 : ((value == o.intValue()) ? 0 : 1);
    }
}

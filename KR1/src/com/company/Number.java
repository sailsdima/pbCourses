package com.company;

/**
 * Created by dima on 31.05.17.
 */
public abstract class Number implements Comparable<Number>{

    public abstract int intValue();
    public abstract float floatValue();

    public abstract Number sum(Number n2);
    public abstract Number multiply(Number n2);
    public abstract Number division(Number n2);

}

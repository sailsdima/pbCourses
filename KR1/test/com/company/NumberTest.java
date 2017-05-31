package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by dima on 31.05.17.
 */
class NumberTest {
    private Number integer;
    private Number real;

    @BeforeEach
    void setUp() {
        integer = new MyInteger(5);
        real = new MyReal(1.1f);
    }
    @Test
    public void intValueForInteger() throws Exception {
        assertEquals(5, integer.intValue());
    }

    @Test
    public void floatValueForInteger() throws Exception {
        assertEquals(5.0f, integer.intValue());
    }

    @Test
    public void intValueForReal() throws Exception {
        assertEquals(1, real.intValue());
    }

    @Test
    public void floatValueForReal() throws Exception {
        assertEquals(1.1f, real.floatValue());
    }

    @Test
    public void sumIntInt() throws Exception {
        assertEquals(10, integer.sum(integer).intValue());
    }
    @Test
    public void sumIntReal() throws Exception {
        assertEquals(6, integer.sum(real).intValue());
    }
    @Test
    public void sumRealInt() throws Exception {
        assertEquals(6.1f, real.sum(integer).floatValue());
    }
    @Test
    public void sumRealReal() throws Exception {
        assertEquals(2.2f, real.sum(real).floatValue());
    }

    @Test
    public void multiplyIntInt() throws Exception {
        assertEquals(25, integer.multiply(integer).floatValue());
    }
    @Test
    public void multiplyIntReal() throws Exception {
        assertEquals(5, integer.multiply(real).floatValue());
    }
    @Test
    public void multiplyRealInt() throws Exception {
        assertEquals(5.5f, real.multiply(integer).floatValue());

    }
    @Test
    public void multiplyRealReal() throws Exception {
        assertEquals(1.21f, real.multiply(real).floatValue());

    }

    @Test
    public void divisionIntInt() throws Exception {
        assertEquals(1, integer.division(integer).floatValue());
    }
    @Test
    public void divisionRealReal() throws Exception {
        assertEquals(1.0f, real.division(real).floatValue());
    }

    @Test
    public void compareToTestIntEquals() {
        Number integer1 = new MyInteger(5);
        assertEquals(0, integer.compareTo(integer1));
    }
    @Test
    public void compareToTestIntLess() {
        Number integer1 = new MyInteger(7);
        assertEquals(-1, integer.compareTo(integer1));
    }
    @Test
    public void compareToTestIntLarger() {
        Number integer1 = new MyInteger(2);
        assertEquals(1, integer.compareTo(integer1));
    }

    @Test
    public void compareToTestRealLess() {
        Number real1 = new MyReal(0.0f);
        assertEquals(1, integer.compareTo(real1));
    }
    @Test
    public void compareToTestRealLarger() {
        Number real1 = new MyReal(7.0f);
        assertEquals(-1, integer.compareTo(real1));
    }
}
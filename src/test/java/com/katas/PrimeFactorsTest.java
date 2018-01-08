package com.katas;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    @Test
    public void testFour() {
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(list(2, 3), PrimeFactors.generate(6));
    }

    @Test
    public void testEight() {
        assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
    }

    @Test
    public void testNine() {
        assertEquals(list(3, 3), PrimeFactors.generate(9));
    }

    @Test
    public void test144() {
        assertEquals(list(2, 2, 2, 2, 3, 3), PrimeFactors.generate(144));
    }

    @Test
    public void test360() {
        assertEquals(list(2, 2, 2, 3, 3, 5), PrimeFactors.generate(360));
    }

    private List<Integer> list(int ... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i :ints)
            list.add(i);

        return list;
    }

}
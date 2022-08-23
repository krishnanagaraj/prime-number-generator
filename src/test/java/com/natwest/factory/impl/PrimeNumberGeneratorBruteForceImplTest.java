package com.natwest.factory.impl;

import com.natwest.factory.PrimeNumberStrategy;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class PrimeNumberGeneratorBruteForceImplTest {

    /**
     * The Prime number generator strategy.
     */
    protected PrimeNumberStrategy primeNumberStrategy;

    @Before
    public void setUp() throws Exception {
        primeNumberStrategy = new PrimeNumberBruteForceImpl();
    }

    @Test
    public void calculate() throws Exception {
        List<Integer> primeNumbers = primeNumberStrategy.calculate(10);
        assertArrayEquals(new Integer[] {2, 3, 5, 7}, primeNumbers.toArray());
    }
}

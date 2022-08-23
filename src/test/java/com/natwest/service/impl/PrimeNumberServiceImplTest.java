package com.natwest.service.impl;

import com.natwest.exception.InvalidInputNumber;
import com.natwest.model.PrimeNumberGenerationType;
import com.natwest.model.Response;
import com.natwest.service.PrimeNumberService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberServiceImplTest {

    private PrimeNumberService primeNumberService;

    @Before
    public void setUp() throws Exception {
        primeNumberService = new PrimeNumberServiceImpl();
    }

    @Test
    public void generateUpTo() throws Exception {
        Response primeNumberResponse = primeNumberService.primeNumberGenerator(10, PrimeNumberGenerationType.SIEVE_ERATOSTHENES);
        assertEquals(10, primeNumberResponse.getInputNumber());
        assertArrayEquals(new Integer[] {2, 3, 5, 7}, primeNumberResponse.getPrimeNumbers().toArray());
    }

    @Test(expected = InvalidInputNumber.class)
    public void generateUpToWithNegativeNumber() throws Exception {
        primeNumberService.primeNumberGenerator(-1, PrimeNumberGenerationType.SIEVE_ERATOSTHENES);
    }
}

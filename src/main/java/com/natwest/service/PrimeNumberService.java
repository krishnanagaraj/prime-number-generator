package com.natwest.service;

import com.natwest.model.PrimeNumberGenerationType;
import com.natwest.model.Response;

/**
 * The interface Prime number service.
 */
public interface PrimeNumberService {

    /**
     * Generate up to prime number response.
     *
     * @param primeNumberLimit  the limit
     * @param primeNumberGenerationType the prime number generator type
     * @return the prime number response
     */
    Response primeNumberGenerator(Integer primeNumberLimit, PrimeNumberGenerationType primeNumberGenerationType);
}

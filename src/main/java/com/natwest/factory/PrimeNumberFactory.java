package com.natwest.factory;

import com.natwest.factory.impl.PrimeNumberBruteForceImpl;
import com.natwest.factory.impl.PrimeNumberSieveEratosthenesImpl;
import com.natwest.model.PrimeNumberGenerationType;

/**
 * Prime number factory.
 */
public class PrimeNumberFactory {

    /**
     * Create prime number strategy.
     *
     * @param primeNumberGenerationType the prime number generator type
     * @return the prime number generator strategy
     */
    public static PrimeNumberStrategy create(PrimeNumberGenerationType primeNumberGenerationType) {
        switch (primeNumberGenerationType) {
            case BRUTE_FORCE:
                return new PrimeNumberBruteForceImpl();
            case SIEVE_ERATOSTHENES:
                return new PrimeNumberSieveEratosthenesImpl();
            default:
                return new PrimeNumberSieveEratosthenesImpl();
        }
    }
}

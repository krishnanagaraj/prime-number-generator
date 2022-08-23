package com.natwest.factory;

import com.natwest.factory.impl.PrimeNumberBruteForceImpl;
import com.natwest.factory.impl.PrimeNumberSieveEratosthenesImpl;
import com.natwest.model.PrimeNumberGenerationType;

/**
 * The type Prime number generator factory.
 */
public class PrimeNumberFactory {

    /**
     * Create prime number generator strategy.
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

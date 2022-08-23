package com.natwest.factory;

import com.natwest.factory.impl.PrimeNumberBruteForceImpl;
import com.natwest.factory.impl.PrimeNumberSieveEratosthenesImpl;
import com.natwest.model.PrimeNumberGenerationType;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * The type Prime number generator factory test.
 */
public class PrimeNumberFactoryTest {

    private PrimeNumberStrategy primeNumberStrategy;

    /**
     * Create.
     *
     * @throws Exception the exception
     */
    @Test
    public void create() throws Exception {
        primeNumberStrategy = PrimeNumberFactory.create(PrimeNumberGenerationType.BRUTE_FORCE);
        assertThat(primeNumberStrategy, Matchers.instanceOf(PrimeNumberBruteForceImpl.class));
        primeNumberStrategy = PrimeNumberFactory.create(PrimeNumberGenerationType.SIEVE_ERATOSTHENES);
        assertThat(primeNumberStrategy, Matchers.instanceOf(PrimeNumberSieveEratosthenesImpl.class));
    }
}

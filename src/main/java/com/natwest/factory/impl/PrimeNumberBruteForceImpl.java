package com.natwest.factory.impl;

import com.natwest.factory.PrimeNumberStrategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Brute force prime number generator.
 */
public class PrimeNumberBruteForceImpl implements PrimeNumberStrategy {

    @Override
    public List<Integer> calculate(Integer limit) {
        return IntStream.rangeClosed(2, limit)
            .filter(this::isPrime)
            .boxed()
            .collect(Collectors.toList());
    }

    private boolean isPrime(int number) {
        return IntStream.range(2, number).noneMatch(x -> number % x == 0);
    }
}

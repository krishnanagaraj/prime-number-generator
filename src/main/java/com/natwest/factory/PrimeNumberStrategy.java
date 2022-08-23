package com.natwest.factory;

import java.util.List;

/**
 * Prime number strategy.
 */
public interface PrimeNumberStrategy {

    /**
     * Calculate list.
     *
     * @param limit the limit
     * @return the list
     */
    List<Integer> calculate(Integer limit);
}

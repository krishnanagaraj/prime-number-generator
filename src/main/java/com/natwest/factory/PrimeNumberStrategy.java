package com.natwest.factory;

import java.util.List;

/**
 * The interface Prime number generator strategy.
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

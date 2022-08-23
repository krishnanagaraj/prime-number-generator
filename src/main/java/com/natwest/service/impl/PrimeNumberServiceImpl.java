package com.natwest.service.impl;

import com.natwest.exception.InvalidInputNumber;
import com.natwest.factory.PrimeNumberFactory;
import com.natwest.factory.PrimeNumberStrategy;
import com.natwest.model.PrimeNumberGenerationType;
import com.natwest.model.Response;
import com.natwest.service.PrimeNumberService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Prime number service.
 */
@Service
public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Cacheable("primeNumberResponse")
    @Override
    public Response primeNumberGenerator(Integer primeNumberLimit, PrimeNumberGenerationType primeNumberGenerationType) {
        this.validateLimit(primeNumberLimit);

        PrimeNumberStrategy primeNumberGenerator = PrimeNumberFactory.create(primeNumberGenerationType);

        List<Integer> primeNumbers = primeNumberGenerator.calculate(primeNumberLimit);
        return new Response(primeNumberLimit, primeNumbers);
    }

    /**
     * Validate input number
     *
     * @param inputNumber Integer
     */
    private void validateLimit(Integer inputNumber) {
        if (inputNumber < 0) {
            throw new InvalidInputNumber("Invalid input number");
        }
    }
}

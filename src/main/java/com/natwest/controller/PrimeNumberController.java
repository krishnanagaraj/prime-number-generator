package com.natwest.controller;

import com.natwest.model.PrimeNumberGenerationType;
import com.natwest.model.Response;
import com.natwest.service.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/primes")
public class PrimeNumberController {

    @Autowired
    private PrimeNumberService primeNumberService;

    @GetMapping(value = "/{number}")
    public ResponseEntity<Response> getPrimeNumbers(@PathVariable(value = "number") Integer number, @RequestParam(name = "primeNumberGenerationType", defaultValue = "SIEVE_ERATOSTHENES") PrimeNumberGenerationType primeNumberGenerationType) {

        Response response = primeNumberService.primeNumberGenerator(number, primeNumberGenerationType);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

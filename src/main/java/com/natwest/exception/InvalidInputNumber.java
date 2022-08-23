package com.natwest.exception;

/**
 * Invalid prime number input type.
 */
public class InvalidInputNumber extends RuntimeException {

    /**
     * Invalid prime number input.
     *
     * @param message the message
     */
    public InvalidInputNumber(String message) {
        super(message);
    }
}

package com.natwest.exception.handler;

import com.natwest.exception.InvalidInputNumber;
import com.natwest.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class that handles the common exceptions
 */
@ControllerAdvice
@RestController
public class PrimeNumberExceptionHandler {

    @ExceptionHandler(value = {InvalidInputNumber.class})
    public ResponseEntity<ErrorResponse> exceptionUserNotFound(InvalidInputNumber e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE), HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }
}

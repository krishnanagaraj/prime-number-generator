package com.natwest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * Class that represents an API Error response
 */
@Data
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private HttpStatus status;
}

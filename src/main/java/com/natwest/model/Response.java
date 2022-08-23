package com.natwest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Response {
    @JsonProperty("input_number")
    Integer inputNumber;

    @JsonProperty(value="prime_numbers")
    List<Integer> primeNumbers;

}

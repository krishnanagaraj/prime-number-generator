package com.natwest.controller;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.hasItems;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PrimeNumberControllerTest {

    @LocalServerPort
    int port;

    @Test
    public void test_primeNumbers_for_SuccessfulJsonBody() {
        RestAssured.
                given().
                port(port).
                config(RestAssured.config().
                        sslConfig(new SSLConfig().relaxedHTTPSValidation())).
                accept(ContentType.JSON).
                when().get("/v1/primes/5?type=BRUTE_FORCE").then().
                assertThat().
                statusCode(200).
                and().
                body("prime_numbers", hasItems(2,3)).
                body("input_number", Matchers.is(Integer.valueOf(5)));
    }

    @Test
    public void test_primeNumbers_for_SuccessfulXmlBody() {
        RestAssured.
                given().
                port(port).
                config(RestAssured.config().
                        sslConfig(new SSLConfig().relaxedHTTPSValidation())).
                accept(ContentType.XML).
                when().get("/v1/primes/10?type=BRUTE_FORCE").then().
                assertThat().
                statusCode(200).
                and().
                body("Response.prime_numbers.prime_numbers", hasItems("2","3","5","7")).
                body("Response.input_number", Matchers.is("10"));
    }

    @Test
    public void test_primeNumbers_for_negative_number() {
        RestAssured.
                given().
                port(port).
                config(RestAssured.config().
                        sslConfig(new SSLConfig().relaxedHTTPSValidation())).
                accept(ContentType.JSON).
                when().get("/v1/primes/-1?type=BRUTE_FORCE").then().
                assertThat().
                statusCode(416).
                and().
                body("message", Matchers.is("Invalid input number"));
    }
}

# prime-number-generator
RESTful service which calculates and returns all the prime numbers up to and including a number provided.

## Setting up the development environment

1. Install Intellij.
2. Clone the repository using git clone to your local system.
3. Use gradle tasks to build the code. For e.g. ./gradlew clean build command will clean and build the repo in local.
4. All the responses are cached

## How to run the application

Run command ./gradlew bootRun to run the application on default port 8080

## Testing

Get all the prime numbers based on the input value. Specify the type of algorithm in type query param. Values are SIEVE_ERATOSTHENES or BRUTE_FORCE.

`GET http://localhost:8080/v1/primes/{input_number}?type={algorithm}`

1. JSON response

   Request `curl -X GET -H "Accept: application/json" http://localhost:8080/v1/primes/20?type=BRUTE_FORCE`\

   Response `{"input_number":20,"prime_numbers":[2,3,5,7,11,13,17,19]}`

2. XML response

   Request `curl -X GET -H "Accept: application/xml" http://localhost:8080/v1/primes/40?type=SIEVE_ERATOSTHENES`\

   Response `<Response><input_number>40</input_number><prime_numbers><prime_numbers>2</prime_numbers><prime_numbers>3</prime_numbers><prime_numbers>5</prime_numbers><prime_numbers>7</prime_numbers><prime_numbers>11</prime_numbers><prime_numbers>13</prime_numbers><prime_numbers>17</prime_numbers><prime_numbers>19</prime_numbers><prime_numbers>23</prime_numbers><prime_numbers>29</prime_numbers><prime_numbers>31</prime_numbers><prime_numbers>37</prime_numbers></prime_numbers></Response>`

## Language, Frameworks & Tools

* Java 11
* Spring Boot
* Gradle
* IntelliJ
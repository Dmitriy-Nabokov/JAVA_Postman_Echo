package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MobileBankApiTestV1 {
    @Test
    public void shouldMakePOSTRequest() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Current date: 04.11.2022")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data",equalTo("Current date: 04.11.2022"));

    }
}


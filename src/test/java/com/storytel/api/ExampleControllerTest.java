package com.storytel.api;

import io.micronaut.http.HttpHeaders;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.restassured.RestAssured;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@MicronautTest
class ExampleControllerTest {

    @Inject
    EmbeddedServer server;

    @BeforeEach
    public void setup() {
        RestAssured.port = server.getPort();
    }

    @Test
    void verifyDoHelloWorldPlainText() {
        final String name = "test-user";

        given()
            .header(HttpHeaders.ACCEPT, "text/plain")
            .when()
            .get("/example/hello-world/{name}.txt", Map.of("name", name))
            .then()
            .statusCode(200)
            .contentType("text/plain")
            .body(is("Hello, test-user"));
    }

    @Test
    void verifyDoHelloWorldJson() {
        final String name = "test-user";

        given()
            .header(HttpHeaders.ACCEPT, "application/json")
            .when()
            .get("/example/hello-world/{name}.json", Map.of("name", name))
            .then().assertThat()
            .statusCode(200)
            .contentType("application/json")
            .body(is("{\"name\":\"test-user\",\"greeting\":\"Hello, test-user\"}"));
    }

}

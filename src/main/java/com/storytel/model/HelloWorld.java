package com.storytel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record HelloWorld(String name) {

    @JsonProperty
    public String getGreeting() {
        return "Hello, " + name();
    }

}

package no.romundstad.springbootapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {
    private final String message;

    public Hello(String message) {
        this.message = message;
    }

    @JsonProperty(value = "message")
    public String getMessage() {
        return message;
    }

}

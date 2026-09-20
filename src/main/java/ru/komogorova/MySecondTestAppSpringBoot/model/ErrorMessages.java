package ru.komogorova.MySecondTestAppSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorMessages {

    EMPTY(""),

    VALIDATION("Validation error"),

    UNSUPPORTED("An unexpected error occurred"),

    UNKNOWN("Unsupported error");

    private final String description;

    ErrorMessages (String description) {

        this.description = description;
    }

    @JsonValue

    public String getName() {

        return description;

    }

}
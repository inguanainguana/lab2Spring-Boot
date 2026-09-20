package ru.komogorova.MySecondTestAppSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Systems {
    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System"),
    SERVICE_1("Service 1");

    private final String name;

    Systems(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @JsonCreator
    public static Systems registerUser(String code) {
        for (Systems param : Systems.values()) {
            if (param.getName().equalsIgnoreCase(code) || param.name().equalsIgnoreCase(code)) {
                return param;
            }
        }
        return null;
    }
}
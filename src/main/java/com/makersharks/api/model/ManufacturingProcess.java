package com.makersharks.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ManufacturingProcess {
    MOULDING,
    _3D_PRINTING("3D_PRINTING"),
    CASTING,
    COATING;

    private String value;

    ManufacturingProcess() {
        this.value = this.name();
    }

    ManufacturingProcess(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ManufacturingProcess fromValue(String value) {
        for (ManufacturingProcess process : ManufacturingProcess.values()) {
            if (process.value.equalsIgnoreCase(value)) {
                return process;
            }
        }
        throw new IllegalArgumentException("Invalid manufacturing process: " + value);
    }
}

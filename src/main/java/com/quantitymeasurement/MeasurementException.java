package com.quantitymeasurement;

public class MeasurementException extends Exception {

    enum ExceptionType {
        NULL_VALUE
    }

    ExceptionType type;

    public MeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

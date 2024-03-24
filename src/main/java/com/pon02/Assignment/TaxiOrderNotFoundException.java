package com.pon02.Assignment;

public class TaxiOrderNotFoundException extends RuntimeException {
    public TaxiOrderNotFoundException(String message,Throwable cause) {
        super(message, cause);
    }
}

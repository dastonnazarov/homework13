package com.example.homework13.exception;

public class AppBadRequestException extends Throwable {
    public AppBadRequestException(String message) {
        super(message);
    }
}

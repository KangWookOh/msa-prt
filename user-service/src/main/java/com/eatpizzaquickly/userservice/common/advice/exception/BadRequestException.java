package com.eatpizzaquickly.userservice.common.advice.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {super(message);}
}

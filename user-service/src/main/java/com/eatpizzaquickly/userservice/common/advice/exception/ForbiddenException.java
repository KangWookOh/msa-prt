package com.eatpizzaquickly.userservice.common.advice.exception;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {super(message);}
}

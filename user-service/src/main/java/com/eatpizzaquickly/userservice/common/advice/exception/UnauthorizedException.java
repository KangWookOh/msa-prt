package com.eatpizzaquickly.userservice.common.advice.exception;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {super(message);}
}

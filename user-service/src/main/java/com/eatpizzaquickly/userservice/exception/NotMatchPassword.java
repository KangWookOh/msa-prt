package com.eatpizzaquickly.userservice.exception;


import com.eatpizzaquickly.userservice.common.advice.exception.BadRequestException;

public class NotMatchPassword extends BadRequestException {
    public NotMatchPassword(String message) {
        super(message);
    }
}

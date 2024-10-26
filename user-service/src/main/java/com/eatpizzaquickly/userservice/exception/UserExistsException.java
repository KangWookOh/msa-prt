package com.eatpizzaquickly.userservice.exception;

import com.eatpizzaquickly.userservice.common.advice.exception.BadRequestException;

public class UserExistsException extends BadRequestException {
    public UserExistsException(String message) {
        super(message);
    }
}

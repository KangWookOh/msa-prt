package com.eatpizzaquickly.userservice.service;

import com.eatpizzaquickly.userservice.dto.UserRequestDto;
import com.eatpizzaquickly.userservice.dto.UserResponseDto;

public interface UserService {

    UserResponseDto signUp(UserRequestDto userRequestDto);

    String login(UserRequestDto userRequestDto);

    void deleteUser(String email,String password);
}

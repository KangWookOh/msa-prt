package com.eatpizzaquickly.userservice.controller;

import com.eatpizzaquickly.userservice.common.advice.ApiResponse;
import com.eatpizzaquickly.userservice.common.config.CustomUserDetails;
import com.eatpizzaquickly.userservice.dto.UserRequestDto;
import com.eatpizzaquickly.userservice.dto.UserResponseDto;
import com.eatpizzaquickly.userservice.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RestController
@Slf4j
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponseDto>> signUp(@RequestBody UserRequestDto userRequestDto) {
        UserResponseDto user = userService.signUp(userRequestDto);
        return ResponseEntity.ok(ApiResponse.success("회원가입 성공",user));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<String>> login(@RequestBody UserRequestDto userRequestDto) {
        String token = userService.login(userRequestDto);
        return ResponseEntity.ok(ApiResponse.success("로그인 성공",token));
    }
    @PatchMapping("/delete")
    public ResponseEntity<ApiResponse<String>> logout(@AuthenticationPrincipal CustomUserDetails authUser, @RequestBody UserRequestDto userRequestDto) {
        log.info("user:{}",authUser);
        String email = authUser.getEmail();
        userService.deleteUser(email,userRequestDto.getPassword());
        return ResponseEntity.ok(ApiResponse.success("회원탈퇴 성공"));

    }
}

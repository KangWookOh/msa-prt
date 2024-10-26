package com.eatpizzaquickly.userservice.dto;
import com.eatpizzaquickly.userservice.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

    private String email;



    private String password;



    private String nickname;

    private UserRole userRole;

}

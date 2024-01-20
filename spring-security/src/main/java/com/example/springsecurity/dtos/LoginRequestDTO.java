package com.example.springsecurity.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginRequestDTO {
    private String username;
    private String password;
}

package com.example.emoney.dtos.response;


public class AuthenticationResponseDto {
    String token;

    public AuthenticationResponseDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}

package com.security.springsecurity_v2.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class LoginRequest {

    // esta pedira las credenciales

    String username;
    String passowrd;
}

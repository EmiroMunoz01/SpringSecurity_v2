package com.security.springsecurity_v2.Auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {

    String username;
    String passoword;
    String firstname;
    String lastname;
    String country;

}

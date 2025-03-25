package com.security.springsecurity_v2.Auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//se hara la respuesta independientenemente de si es un registro o un login, nos interesa que nos devuelva el token

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    String token;

}

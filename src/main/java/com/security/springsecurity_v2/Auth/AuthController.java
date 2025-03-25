package com.security.springsecurity_v2.Auth;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    //se estan creando los endpoints a modo de prueba para validad su seguridad

    @PostMapping(value = "login")
    public String login() {
        return "Login from public endpoint";
    }

    @PostMapping(value = "register")
    public String register(){
        return "Register from public endpoint";
    }



}

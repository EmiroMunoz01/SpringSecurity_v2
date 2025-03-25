package com.security.springsecurity_v2.Auth;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    // se estan creando los endpoints a modo de prueba para validad su seguridad
    // 5 debemos especificar como va a esperar en este caso el controller los
    // request y response, para eso crearemos 3 clases, una la vamos a llamar loginRequest, registerRequest, AuthResponse

    //6 por medio de esta variable accederemos a los metodos del login y response justamente para acceder al token que sera la respuesta que nos va a devolver
    
    private final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {

        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

}

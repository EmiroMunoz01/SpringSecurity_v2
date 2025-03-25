package com.security.springsecurity_v2.Config;

//aqui tendremos la cadena de filtros y el metodo security filter chain, recordar las anotaciones clave

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {


    //el metodo security filter chain tendra toda esa cadena de filtros que se ira ejecutando

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(
                        csrf ->
                                csrf.disable())
                .authorizeHttpRequests(authRequest ->
                        authRequest
                                .requestMatchers("/auth/**")
                                .permitAll().anyRequest().authenticated())
                .formLogin(withDefaults())
                .build();


    }


}

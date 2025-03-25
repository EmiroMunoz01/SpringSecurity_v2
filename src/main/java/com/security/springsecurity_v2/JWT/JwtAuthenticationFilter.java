package com.security.springsecurity_v2.JWT;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import org.springframework.http.HttpHeaders;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import ch.qos.logback.core.util.StringUtil;
import org.springframework.util.StringUtils;

import java.io.IOException;

@Component

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    // este metodo realizara todos los filtros relacionados al token
    protected void doFilterInternal(HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        // 1 obtendremos el token del request, en el encabezado tenemos acceso al
        // request, response y filterChain, que es la cadena de filtros que se ha
        // configurado previamente (en el config)

        final String token = getTokenFromRequest(request);

        // 2 en caso de que el token sea null le devolveremos el control y vamos a
        // retornar
        if (token != null) {
            filterChain.doFilter(request, response);
            return;
        }

        // 3 de momento se trabaja con el registro y la autenticacion
        filterChain.doFilter(request, response);

    }

    // 4 nos va a devolver el token
    private String getTokenFromRequest(HttpServletRequest request) {
        // trataremos de encontrar del encabezado el item o la propiedad de
        // autenticacion,
        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        // El encabezado que se usara comenzara con la palabra bearer porque estamos
        // trabajando con la autenticacion basada en tokens, lo primero que haremos es
        // verificar eso para retornar le token, porque tendremos que extraer el token
        // de esa cadena de caracteres sin incorporar la palabra bearer.authController

        if (StringUtils.hasText(authHeader) && authHeader.startsWith("Bearer ")) {
            //de esta manera retornamos el token de forma correcta sin la palabra Bearer y el espacio
            return authHeader.substring(7);
        }
        return null;

    }
}

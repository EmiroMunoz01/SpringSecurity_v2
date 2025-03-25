package com.security.springsecurity_v2.EndpointsProtected;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EndpointsProtected {

    //aqui tenemos los endpoints que estaran protegidos

    @PostMapping(value = "home")
    public String welcome(){
        return "Welcome from secure endpoint";
    }

}

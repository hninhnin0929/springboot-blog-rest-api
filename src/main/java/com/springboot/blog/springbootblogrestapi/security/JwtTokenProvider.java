package com.springboot.blog.springbootblogrestapi.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private String jwtSecret;
    private String jwtExpirationDate;
}

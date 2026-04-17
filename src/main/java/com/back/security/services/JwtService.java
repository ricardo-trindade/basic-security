package com.back.security.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import static java.security.KeyRep.Type.SECRET;

@Service
public class JwtService {

    private final String SECRET = "umdoistresquatrocincoseisseteoitonovedezonzedozetrezecatorze";

    public String gerarToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .compact();
    }
}

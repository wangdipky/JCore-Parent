package vn.com.v4v.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import vn.com.v4v.service.IJwtService;

import java.util.Date;
import java.util.Map;

/**
 * Name: JwtServiceImpl
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 05/07/2025
 */
@Service("jwtService")
public class JwtServiceImpl implements IJwtService {

    @Value("${jwt.secret_key}")
    private String secret;

    @Override
    public String generateToken(String authKey, Map<String, String> claims) {
        return createToken(authKey, claims);
    }

    private String createToken(String authKey, Map<String, String> claims) {

        return Jwts
                .builder()
                .claims(claims)
                .subject(authKey)
                .signWith(Keys.hmacShaKeyFor(Decoders.BASE64URL.decode(secret)))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .compact();
    }

}
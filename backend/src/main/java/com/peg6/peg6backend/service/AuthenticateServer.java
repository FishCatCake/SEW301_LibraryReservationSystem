package com.peg6.peg6backend.service;


import com.peg6.peg6backend.entity.TokenEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateServer {
    TokenEntity tokenEntity = new TokenEntity();

    public boolean authenticateToken(String Token){
        if(Token.equals(tokenEntity.token)){
            return true;
        }
        else return false;
    }
}
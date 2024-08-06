package br.com.pedromagno.authorization.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AuthorizationService {

    public boolean isAuthorized(){
        Random random = new Random();
        boolean isAuthorized = random.nextBoolean();
        return isAuthorized;
    }


}

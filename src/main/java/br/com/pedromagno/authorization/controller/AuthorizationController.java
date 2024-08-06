package br.com.pedromagno.authorization.controller;

import br.com.pedromagno.authorization.domain.Authorization;
import br.com.pedromagno.authorization.dto.AuthorizeDTO;
import br.com.pedromagno.authorization.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorize")
public class AuthorizationController {
    @Autowired
    private AuthorizationService authorizationService;

    @GetMapping()
    public ResponseEntity<AuthorizeDTO> getAuthorization(){
        if(authorizationService.isAuthorized()){
            Authorization authorization = new Authorization("success", true);

            return new ResponseEntity<>(new AuthorizeDTO(authorization), HttpStatus.OK);
        }
        Authorization authorization = new Authorization("fail", false);

        return new ResponseEntity<>(new AuthorizeDTO(authorization), HttpStatus.FORBIDDEN);
    }
}

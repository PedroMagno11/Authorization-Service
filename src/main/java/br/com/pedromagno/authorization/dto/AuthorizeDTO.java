package br.com.pedromagno.authorization.dto;

import br.com.pedromagno.authorization.domain.Authorization;

public record AuthorizeDTO(String status, AuthorizationDTO data) {
    public AuthorizeDTO(Authorization authorization) {
        this(authorization.getStatus(), new AuthorizationDTO(authorization.isAuthorize()));
    }
}

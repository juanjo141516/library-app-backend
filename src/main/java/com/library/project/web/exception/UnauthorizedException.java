package com.library.project.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException{
    private String resourceName;

    public UnauthorizedException(String resourceName) {
        super(String.format("El %s ingresado no existe",resourceName));
        this.resourceName = resourceName;
    }
}

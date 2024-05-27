package com.library.project.web.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public class ArrayListFormatException extends RuntimeException{
    private String resourceName;
    private List<String> fieldName;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public List<String> getFieldName() {
        return fieldName;
    }

    public void setFieldName(List<String> fieldName) {
        this.fieldName = fieldName;
    }

    public ArrayListFormatException(List<String> fieldName, String resourceName) {
        super(String.format("%s format is incorrect: %s",resourceName,fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
    }
}

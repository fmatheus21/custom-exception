package com.fmatheus.app.exception.swagger;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAttribute {

    private String error;
    private String errorDescription;

}

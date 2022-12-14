package com.fmatheus.app.exception.handler.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fmatheus.app.enumerable.MessageEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageResponse {

    private LocalDateTime timestamp = LocalDateTime.now();
    private int statusCode;
    private String statusDescription;
    private String cause;
    private String message;


    public MessageResponse(MessageEnum messageEnum, String cause, String message) {
        this.statusCode = messageEnum.getHttpSttus().value();
        this.statusDescription = messageEnum.getHttpSttus().name();
        this.cause = cause;
        this.message = message;
    }

    public MessageResponse(HttpStatus httpStatus, String message) {
        this.statusCode = httpStatus.value();
        this.statusDescription = httpStatus.name();
        this.cause = httpStatus.getReasonPhrase();
        this.message = message;
    }

}
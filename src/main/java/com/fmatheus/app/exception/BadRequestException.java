package com.fmatheus.app.exception;


import com.fmatheus.app.enumerable.MessagesEnum;

import java.io.Serial;

/**
 * Ao lancar esta excecao, a mesma sera capturada pela classe AppExceptionHandler onde sera tratada.
 *
 * @author Fernando Matheus
 */
public class BadRequestException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public BadRequestException(MessagesEnum messagesEnum) {
        super(messagesEnum.getMessage());
    }

}

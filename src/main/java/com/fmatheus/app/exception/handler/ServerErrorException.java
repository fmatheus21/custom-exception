package com.fmatheus.app.exception.handler;

import java.io.Serial;

/**
 * Ao lancar esta excecao, a mesma sera capturada pela classe AppExceptionHandler onde sera tratada.
 *
 * @author Fernando Matheus
 */
public class ServerErrorException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ServerErrorException(String message) {
        super(message);
    }

}

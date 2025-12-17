package com.agendatarefa.notificador.infrastructure.exceptions;

public class SendEmailException extends RuntimeException {
    public SendEmailException(String message) {
        super(message);
    }

    public SendEmailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

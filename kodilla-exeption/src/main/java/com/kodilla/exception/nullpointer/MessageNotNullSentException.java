package com.kodilla.exception.nullpointer;

public class MessageNotNullSentException extends Exception {
    public MessageNotNullSentException(final String message) {
        super(message);
    }
}

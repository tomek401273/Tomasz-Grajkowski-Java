package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message)throws MessageNotNullSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }
        throw new MessageNotNullSentException("Object User was null");
    }
}

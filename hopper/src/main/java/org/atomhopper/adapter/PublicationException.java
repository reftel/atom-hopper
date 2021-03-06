package org.atomhopper.adapter;

public class PublicationException extends RuntimeException {

    public PublicationException(String message) {
        super(message);
    }

    public PublicationException(String message, Throwable cause) {
        super(message, cause);
    }
}

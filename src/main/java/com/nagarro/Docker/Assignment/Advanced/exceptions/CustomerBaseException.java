package com.nagarro.Docker.Assignment.Advanced.exceptions;


public class CustomerBaseException extends RuntimeException {

    public CustomerBaseException() {
    }

    public CustomerBaseException(String message) {
        super(message);
    }
}

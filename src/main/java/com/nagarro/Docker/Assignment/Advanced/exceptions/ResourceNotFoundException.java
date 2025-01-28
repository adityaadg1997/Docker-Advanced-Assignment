package com.nagarro.Docker.Assignment.Advanced.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resource, String resourceName, String resourceValue) {
        super(resource + " with " + resourceName + " " + resourceValue + " Not Found! ");
    }
}

package com.nagarro.Docker.Assignment.Advanced.exceptions;

import com.nagarro.Docker.Assignment.Advanced.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException exception) {
        return new ResponseEntity<>(new ApiResponse(exception.getMessage(), false), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CustomerBaseException.class)
    public ResponseEntity<ApiResponse> customerBaseExceptionException(CustomerBaseException exception) {
        return new ResponseEntity<>(new ApiResponse(exception.getMessage(), false), HttpStatus.BAD_REQUEST);
    }
}

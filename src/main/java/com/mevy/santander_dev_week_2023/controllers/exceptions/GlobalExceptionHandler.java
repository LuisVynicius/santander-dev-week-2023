package com.mevy.santander_dev_week_2023.controllers.exceptions;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusinessException(IllegalArgumentException e) {
        return ResponseEntity.unprocessableEntity().body(e.getMessage());
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource ID not found. " + HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable e) {
        logger.error("Unexpected error", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected server error, see the logs. " + HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

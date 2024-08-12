package com.spring_repcap.spring_repcap.advice;

import com.spring_repcap.spring_repcap.exceptions.InvoiceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomControllerAdvice {
    @ExceptionHandler(InvoiceNotFoundException.class)
    public ResponseEntity<String > handleInvoiceNotFoundException(InvoiceNotFoundException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

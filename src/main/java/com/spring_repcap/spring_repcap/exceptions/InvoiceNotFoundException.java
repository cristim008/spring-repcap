package com.spring_repcap.spring_repcap.exceptions;

public class InvoiceNotFoundException extends RuntimeException{

    public InvoiceNotFoundException(String message){
        super(message);
    }
}

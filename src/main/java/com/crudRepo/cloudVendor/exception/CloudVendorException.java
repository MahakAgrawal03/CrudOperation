package com.crudRepo.cloudVendor.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
       private final String message;
       private final Throwable throwable;
       private final HttpStatus httpStatus;
       

    public CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }
    public String getMessage() {
        return this.message;
    }


    public Throwable getThrowable() {
        return this.throwable;
    }


    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    
    
       
}

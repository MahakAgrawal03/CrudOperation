package com.crudRepo.cloudVendor.exception;

public class CloudVendorNotFoundException extends RuntimeException {

   //both are constructor
    public CloudVendorNotFoundException(String message) {
        super(message);
    }
   
    public CloudVendorNotFoundException(String message,Throwable cause) {
        super(message,cause);
    }

}

package com.dailycodework.lakesidehotel.exception;

/**
 * @author Omkar Patil
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

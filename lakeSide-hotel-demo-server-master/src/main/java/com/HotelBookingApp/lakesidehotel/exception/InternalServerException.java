package com.dailycodework.lakesidehotel.exception;

/**
 * @author Omkar Patil
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}

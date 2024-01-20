package com.dailycodework.lakesidehotel.exception;

/**
 * @author Omkar Patil
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

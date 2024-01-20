package com.dailycodework.lakesidehotel.exception;

/**
 * @author Omkar Patil
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}

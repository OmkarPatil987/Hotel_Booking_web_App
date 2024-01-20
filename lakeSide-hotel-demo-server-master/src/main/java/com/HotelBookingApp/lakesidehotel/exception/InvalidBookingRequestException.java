package com.dailycodework.lakesidehotel.exception;

/**
 * @author Omkar Patil
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}

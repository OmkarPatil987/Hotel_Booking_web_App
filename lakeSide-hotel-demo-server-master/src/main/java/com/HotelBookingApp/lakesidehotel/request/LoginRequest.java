package com.dailycodework.lakesidehotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Omkar Patil
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}

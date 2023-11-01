package com.TCorp.FitNetServer.api.dto;

import lombok.Data;

/**
 * File: RegisterDto
 * Author: turnernaef
 * Date: 10/31/23
 * Description: This class is used to transfer registration information from the client to the server.
 */

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String email;
}

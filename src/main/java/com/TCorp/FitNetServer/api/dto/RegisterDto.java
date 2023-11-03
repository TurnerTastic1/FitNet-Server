package com.TCorp.FitNetServer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * File: RegisterDto
 * Author: turnernaef
 * Date: 10/31/23
 * Description: This class is used to transfer registration information from the client to the server.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    private String username;
    private String password;
    private String email;
}

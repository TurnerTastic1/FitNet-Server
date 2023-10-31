package com.TCorp.FitNetServer.api.controller;

import com.TCorp.FitNetServer.api.dto.RegisterDto;
import com.TCorp.FitNetServer.api.model.UserEntity;
import com.TCorp.FitNetServer.api.service.AuthService;
import com.TCorp.FitNetServer.api.service.UserEntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * File: AuthController
 * Author: turnernaef
 * Date: 10/31/23
 * Description:
 */

@RestController
@RequestMapping(path = "auth/")
public class AuthController {

    private final AuthService AuthService;

    public AuthController(AuthService AuthService) {
        this.AuthService = AuthService;
    }

    @PostMapping("register-new-user")
    public ResponseEntity<Map<String, Object>> registerNewUser(@RequestBody RegisterDto registerDto) {
        return AuthService.registerNewUser(registerDto);
    }
}

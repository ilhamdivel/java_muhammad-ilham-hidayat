package com.praktikum.controller;

import com.praktikum.payload.TokenResponse;
import com.praktikum.payload.PhonePassword;
import com.praktikum.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public PhonePassword login(@RequestBody PhonePassword phonePassword) {
        authService.register(phonePassword);
        return phonePassword;
    }

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody PhonePassword req) {
        TokenResponse tokenResponse = authService.generateToken(req);
        return ResponseEntity.ok(tokenResponse);
    }
}

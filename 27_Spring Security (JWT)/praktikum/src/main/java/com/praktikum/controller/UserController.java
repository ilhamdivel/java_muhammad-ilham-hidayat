package com.praktikum.controller;


import com.praktikum.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/v2/auth")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/info")
    public ResponseEntity<?> getUser(Principal principal) {
        return ResponseEntity.ok(principal.getName());
    }
}

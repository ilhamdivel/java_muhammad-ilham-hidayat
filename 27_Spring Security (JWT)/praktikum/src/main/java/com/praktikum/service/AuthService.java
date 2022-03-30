package com.praktikum.service;

import com.praktikum.model.User;
import com.praktikum.payload.TokenResponse;
import com.praktikum.payload.PhonePassword;

public interface AuthService {
    User register(PhonePassword req);
    TokenResponse generateToken(PhonePassword req);
}

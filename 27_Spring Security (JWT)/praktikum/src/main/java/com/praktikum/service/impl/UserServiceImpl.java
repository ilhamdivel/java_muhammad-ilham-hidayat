package com.praktikum.service.impl;

import com.praktikum.model.User;
import com.praktikum.repository.UserRepository;
import com.praktikum.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        User user = userRepository.getDistinctTopByUsername(phone);
        if (user == null)
            throw new UsernameNotFoundException("phone not found");

        return user;
    }
}

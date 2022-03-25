package com.praktikum.service;


import com.praktikum.model.User;
import com.praktikum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> updateUser(Long id, User user) {
        Optional<User> userById = userRepository.findById(id);

        userById.ifPresent(res -> {
            res.setName(user.getName());
            res.setAge(user.getAge());

            userRepository.save(res);
        });

        return userById;
    }

    public void deleteUser(Long id){
        Optional<User> userById = userRepository.findById(id);
        userById.ifPresent(res -> {
            userRepository.delete(res);
        });
    }
}

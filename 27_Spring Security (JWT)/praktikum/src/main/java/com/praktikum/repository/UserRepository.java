package com.praktikum.repository;

import com.praktikum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getDistinctTopByUsername(String username);
}

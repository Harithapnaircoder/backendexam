package com.practice.demo.repository;


import com.practice.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface SignupRepository extends JpaRepository<User, Long> {

        User findByEmail(String email);
    }


package com.example.userapi.service;

import com.example.userapi.User;

import java.util.Optional;

public interface UserService {

    User addUser(User user);

    Optional<User> findUserById(Long id);

    User updateUser(Long id, User userDetails);

    boolean deleteUser(Long id);
}


package com.dio.santaderdio.service;

import com.dio.santaderdio.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> getAllUsers();

    User create(User userCreate);
}

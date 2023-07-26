package com.dio.santaderdio.service;

import com.dio.santaderdio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userCreate);
}

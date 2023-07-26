package com.dio.santaderdio.service.impl;

import com.dio.santaderdio.domain.model.User;
import com.dio.santaderdio.domain.repository.UserRepository;
import com.dio.santaderdio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository  = userRepository;
    };

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @Override
    public User create(User userCreate) {
        if(userRepository.existsByAccountNumber(userCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This user ID already exists.");
        }
        return userRepository.save(userCreate);
    }
}

package com.dio.santaderdio.domain.repository;

import com.dio.santaderdio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}

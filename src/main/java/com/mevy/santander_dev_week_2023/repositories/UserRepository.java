package com.mevy.santander_dev_week_2023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mevy.santander_dev_week_2023.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String accountNumber);

}

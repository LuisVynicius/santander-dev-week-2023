package com.mevy.santander_dev_week_2023.services;

import com.mevy.santander_dev_week_2023.models.User;

public interface UserService {
    
    User findById(Long id);

    User create(User user);

}

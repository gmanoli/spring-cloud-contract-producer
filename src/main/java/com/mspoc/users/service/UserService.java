package com.mspoc.users.service;

import com.mspoc.users.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String showMock() {
        User user = new User(1L, "mock");
        return user.getName();
    }
}

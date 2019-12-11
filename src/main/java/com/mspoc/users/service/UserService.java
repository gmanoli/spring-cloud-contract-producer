package com.mspoc.users.service;

import com.mspoc.users.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${my.test:Config Server is not working. Please check...}")
    private String mockUserName;

    public String showMock() {
        User user = new User(1L, mockUserName);
        return user.getName();
    }
}

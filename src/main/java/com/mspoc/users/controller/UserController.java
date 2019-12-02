package com.mspoc.users.controller;

import com.mspoc.users.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/mock-user-test")
    public String getMockUser() {
        return userService.showMock();
    }

}

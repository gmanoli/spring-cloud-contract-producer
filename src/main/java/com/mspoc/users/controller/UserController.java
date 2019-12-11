package com.mspoc.users.controller;

import com.mspoc.users.service.UserService;
import lombok.extern.java.Log;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Log
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/mock-user-test")
    public String getMockUser() {
        log.info("retrieving mock user");
        return userService.showMock();
    }

}

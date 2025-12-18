package com.example.exepensetracker.Controller;

import com.example.exepensetracker.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/vi/user")
public class UserController {
    private UserService userService;
}

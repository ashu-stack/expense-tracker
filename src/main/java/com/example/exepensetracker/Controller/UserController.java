package com.example.exepensetracker.Controller;

import com.example.exepensetracker.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/vi/user")
public class UserController {
    private UserService userService;


}

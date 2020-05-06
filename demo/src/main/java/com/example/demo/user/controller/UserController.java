package com.example.demo.user.controller;

import com.example.demo.common.entity.ResultVO;
import com.example.demo.user.entity.User;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {

        String i = "11";

        System.out.println(i);

        return userService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");

        return user;
    }

}

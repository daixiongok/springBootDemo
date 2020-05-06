package com.example.demo.user.service;

import com.example.demo.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public String addUser(User user) {
        // 直接编写业务逻辑
        //数据库保存

        System.out.print(user);


        return "success";
    }

}

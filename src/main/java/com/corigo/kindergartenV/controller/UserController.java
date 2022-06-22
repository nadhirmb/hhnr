package com.corigo.kindergartenV.controller;


import com.corigo.kindergartenV.model.User;
import com.corigo.kindergartenV.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @PostMapping("/user/save")
    public void createUser(@RequestBody User user){
        iUserService.saveUser(user);
    }
}

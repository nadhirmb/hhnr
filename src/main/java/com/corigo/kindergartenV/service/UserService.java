package com.corigo.kindergartenV.service;

import com.corigo.kindergartenV.model.User;
import com.corigo.kindergartenV.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user){
        //Code if you want to applay any changes on your data
        //Exp : crypt your password
        user.setPassWord(passwordEncoder.encode(user.getPassWord()));
        user.setCreatedTime(LocalDateTime.now());
        user.setAsset(true);
        return userRepository.save(user);
    }

    //Helping method
    //Impact this class
}

package com.example.monitoring.p6spy.controllers;

import com.example.monitoring.p6spy.entity.User;
import com.example.monitoring.p6spy.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> allUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

}

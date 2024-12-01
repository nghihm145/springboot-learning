package com.mannghi.learning.controller;

import com.mannghi.learning.entity.User;
import com.mannghi.learning.entity.UserRequest;
import com.mannghi.learning.service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-all-user")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/get-user-name")
    public String getUserName(){
        return "Nghi";
    }

    @PostMapping("/add-new-user")
    public User addNewUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/update-id")
    public String updateUserById(){
        return "000";
    }

    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable long id){
         userService.deleteUserById(id);
    }

    @GetMapping("/get-user-by-id/{id}")
    public Optional<User> getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }

    @PutMapping("/update-job-by-id/{id}")
    public void updateJobById(@PathVariable long id, @RequestBody String job) {
        userService.updateJobById(id, job);
    }

    @PutMapping("/update-name-by-id/{id}")
    public void updateNameById(@PathVariable long id, @RequestBody String name) {
        userService.updateNameById(id, name);
    }

    @PutMapping("/update-user-by-id/{id}")
    public Optional<User> updateUserById(@PathVariable long id, @RequestBody UserRequest req) {
        userService.updateUserById(id,req);
        return userService.getUserById(id);
    }
}

package com.octo.ru.system.controller;


import com.octo.ru.system.model.User;
import com.octo.ru.system.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AdminController {
    final UserService userService;
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/change")
    public ResponseEntity<?> change(@RequestBody User user){
        return userService.change(user);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return userService.deleteById(id);
    }

}

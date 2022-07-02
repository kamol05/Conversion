package com.octo.ru.system.controller;


import com.octo.ru.system.model.User;
import com.octo.ru.system.service.UserService;
import com.octo.ru.system.service.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<?> get() {
        return userService.get(UserUtil.getLoginFromAuthentication());
    }

    @PostMapping("/change")
    public ResponseEntity<?> change(@RequestBody User user) {
        return userService.change(user, UserUtil.getLoginFromAuthentication());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(){
        return userService.delete(UserUtil.getLoginFromAuthentication());
    }





}

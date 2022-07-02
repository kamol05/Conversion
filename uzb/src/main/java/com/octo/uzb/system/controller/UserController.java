package com.octo.uzb.system.controller;


import com.octo.uzb.system.model.User;
import com.octo.uzb.system.service.UserService;
import com.octo.uzb.system.service.UserUtil;
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

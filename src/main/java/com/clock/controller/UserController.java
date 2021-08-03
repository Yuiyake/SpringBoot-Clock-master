package com.clock.controller;

import com.clock.bean.User;
import com.clock.bean.po.LoginPO;
import com.clock.bean.po.UserPO;
import com.clock.service.UserService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ApiRes login(@RequestBody LoginPO po) {
        return userService.login(po);
    }

    @PostMapping("/register")
    public ApiRes register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/selectAllUser")
    public ApiRes selectAllUser(@RequestBody UserPO po) {
        return userService.selectAllUser(po);
    }

    @GetMapping("/deleteUser")
    public ApiRes deleteUser(Integer id) {
        return userService.deleteUser(id);
    }

    @PostMapping("/updateUser")
    public ApiRes updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}

package com.clock.controller;

import com.clock.bean.User;
import com.clock.bean.po.LoginPO;
import com.clock.bean.po.UserPO;
import com.clock.service.UserService;
import com.clock.util.ApiRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api("用户api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public ApiRes login(@RequestBody LoginPO po) {
        return userService.login(po);
    }

    @PostMapping("/register")
    @ApiOperation("用户添加")
    public ApiRes register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/selectAllUser")
    @ApiOperation("获取所有用户列表")
    public ApiRes selectAllUser(@RequestBody UserPO po) {
        return userService.selectAllUser(po);
    }

    @PostMapping("/selectForbidUser")
    @ApiOperation("获取所有禁用用户列表")
    public ApiRes selectForbidUser(@RequestBody UserPO po) {
        return userService.selectForbidUser(po);
    }

    @GetMapping("/deleteUser")
    @ApiOperation("删除用户")
    public ApiRes deleteUser(Integer id) {
        return userService.deleteUser(id);
    }

    @PostMapping("/updateUser")
    @ApiOperation("更新用户资料")
    public ApiRes updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @PostMapping("/forbidUser")
    @ApiOperation("禁用用户")
    public ApiRes forbidUser(Integer id){
        return userService.forbidUser(id);
    }

    @PostMapping("/recoveryUser")
    @ApiOperation("恢复用户")
    public ApiRes recoveryUser(Integer id){
        return userService.recoveryUser(id);
    }
}

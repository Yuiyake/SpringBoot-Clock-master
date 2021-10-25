package com.clock.controller;

import com.clock.bean.User;
import com.clock.bean.po.LoginPO;
import com.clock.bean.po.UserPO;
import com.clock.service.UserService;
import com.clock.util.ApiRes;
import com.clock.util.QiNiuUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;

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

    @PostMapping("/selectUserById")
    @ApiOperation("获取当前用户信息")
    public ApiRes selectUserById(Integer id) {
        return userService.selectUserById(id);
    }

    @PostMapping("/selectForbidUser")
    @ApiOperation("获取所有禁用用户列表")
    public ApiRes selectForbidUser(@RequestBody UserPO po) {
        return userService.selectForbidUser(po);
    }

    @DeleteMapping("/deleteUser")
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

    @PostMapping("/imgStr")
    @ApiOperation("上传图片到七牛云")
    public String imgStr(@RequestParam MultipartFile file, HttpServletRequest request) throws IOException {
        // 用来获取其他参数
        MultipartHttpServletRequest params = ((MultipartHttpServletRequest) request);
        String name = params.getParameter("username");
        if (!file.isEmpty()) {
            FileInputStream inputStream = (FileInputStream) file.getInputStream();
//            String path = QiNiuUtils.uploadQNImg(inputStream, PictureUtil.getRandomFileName()); // KeyUtil.genUniqueKey()生成图片的随机名
            String path = QiNiuUtils.uploadQNImg(inputStream, file.getOriginalFilename());
            System.out.print("七牛云返回的图片链接:" + path);
            return path;
        }
        return "上传失败";
    }

    @PostMapping("/selectFUserById")
    @ApiOperation("通过id查询禁用用户")
    public ApiRes selectFUserById(@RequestBody UserPO po) {
        return userService.selectFUserById(po);
    }

    @PostMapping("/selectAUser")
    @ApiOperation("通过id查询普通用户")
    public ApiRes selectAUser(@RequestBody UserPO po) {
        return userService.selectAUser(po);
    }

    @PostMapping("/changeIsClock")
    @ApiOperation("用户打卡")
    public ApiRes changeIsClock(Integer id) {
        return userService.changeIsClock(id);
    }

}

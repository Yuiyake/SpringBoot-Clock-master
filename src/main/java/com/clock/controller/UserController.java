package com.clock.controller;

import cn.hutool.core.img.Img;
import com.clock.bean.User;
import com.clock.bean.po.LoginPO;
import com.clock.bean.po.UserPO;
import com.clock.service.UserService;
import com.clock.util.ApiRes;
import com.clock.bean.path;
import com.clock.util.ImgRegulation;
import com.clock.util.QiNiuUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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

//    @RequestMapping("/imgStr")
//    @ApiOperation("保存用户图片")
//    public void imgStr(@RequestParam MultipartFile file, @RequestBody User user) throws IOException {
//        if (file.equals("")){return;}
//        Date date = new Date();
//        String dateForm = new SimpleDateFormat("yyyy-MM-dd").format(date);
//        String casePath = "C:\\Users\\Lenovo\\Desktop\\study\\java\\javaee\\大作业\\Clock-Project\\" +
//                "SpringBoot-Clock-master\\src\\main\\java\\com\\clock\\util\\img"+dateForm;
////        String casePath = path.getFileimg()+dateForm;
//        String imgFormat = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
//
////        简单验证图片
//        ImgRegulation regulation = new ImgRegulation();
//        try {
//            boolean ifimg = regulation.VERIFY(imgFormat);
//            if (false == ifimg)
//                return;
//        } catch (Exception e){
//            return;
//        }
//
//        //  判断文件是否存在
//        File f = new File(casePath);
//        try {
//            if (!f.exists()){
//                f.mkdirs();
//            }
//        }catch (Exception e){
//            return;
//        }
//
////        随机生成图片名字
//        String name = UUID.randomUUID().toString()+imgFormat;
//        file.transferTo(new File(casePath+"\\"+name));
//        //拼接要保存在数据中的图片地址
//        //dateForm 这是动态的文件夹所以要和地址一起存入数据库中
//        //user 为@RequestMapping("/user")
//        String urlImg = "http://localhost:8080/" + "user/show?fileUrl=" + dateForm + "/" + name;
//        user.setUavg(urlImg);
//        userService.setUserAvg(user);
//    }

    @RequestMapping("/imgStr")
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

}

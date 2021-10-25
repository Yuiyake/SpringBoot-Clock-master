package com.clock.controller;

import com.clock.bean.Dynamic;
import com.clock.bean.po.DynamicPO;
import com.clock.dao.ReplyMapper;
import com.clock.service.DynamicService;
import com.clock.service.ReplyService;
import com.clock.service.UserService;
import com.clock.util.ApiRes;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.TimeZone;

@RestController
@RequestMapping("/dynamic")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;

    @Autowired
    private ReplyService replyService;

    @Autowired
    private UserService userService;

    @PostMapping("/selectAllDynamic")
    @ApiOperation("查询所有动态")
    public ApiRes selectAllDynamic(@RequestBody DynamicPO po) {
        return dynamicService.selectAllDynamic(po);
    }

    @PostMapping("/selectDynamicByName")
    @ApiOperation("按名字查询该用户动态")
    public ApiRes selectDynamicByName(String username) {
        return dynamicService.selectDynamicByName(username);
    }

    @GetMapping("/deleteDynamic")
    @ApiOperation("删除动态")
    public ApiRes deleteDynamic(Integer did) {
        return dynamicService.deleteDynamic(did);
    }

    @RequestMapping(path="/selectUserDynamic", method = {RequestMethod.POST})
    @ApiOperation("查询单个用户的动态")
    public ApiRes selectUserDynamic(Integer uid){
        return dynamicService.selectUserDynamic(uid);
    }

    @RequestMapping(path="/selectThisDynamic", method = RequestMethod.POST)
    @ApiOperation("查询当前账号用户动态")
    public ApiRes selectThisDynamic(Integer did){
        return dynamicService.selectThisDynamic(did);
    }

    // 用户打卡
    @PostMapping("/addUserDynamic")
    @ApiOperation("用户添加动态（打卡）")
    public ApiRes addUserDynamic(@RequestBody Dynamic dynamic) {
        TimeZone time = TimeZone.getTimeZone("Etc/GMT-8");  //转换为中国时区
        TimeZone.setDefault(time);
        dynamic.setDtime(new Date());
        System.out.println(dynamic.getDtime());
        return dynamicService.addUserDynamic(dynamic);
    }

    @PostMapping("/updateReplyCount")
    @ApiOperation("动态的回复数量更新")
    public ApiRes updateReplyCount(Integer did){
        return replyService.updateReplyCount(did);
    }

}

package com.clock.controller;

import com.clock.service.ReplyService;
import com.clock.util.ApiRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reply")
@Api("回复api")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @RequestMapping("/selectUserReply")
    @ApiOperation("获取当前动态的评论")
    public ApiRes selectUserReply(Integer did){
        return replyService.selectUserReply(did);
    }



}

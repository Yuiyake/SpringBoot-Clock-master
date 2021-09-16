package com.clock.controller;

import com.clock.bean.vo.ReplyVO;
import com.clock.bean.vo.RootReplyVO;
import com.clock.service.ReplyService;
import com.clock.util.ApiRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/reply")
@Api("回复api")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @PostMapping("/selectUserReply")
    @ApiOperation("获取当前动态的评论")
    public ApiRes selectUserReply(Integer did){
        return ApiRes.ok(replyService.selectUserReply(did));
    }

    @PostMapping("/addRootReply")
    @ApiOperation("添加父评论")
    public ApiRes addRootReply(@RequestBody RootReplyVO rootReplyVO) {
        if (rootReplyVO.getrContents().length() != 0){
            rootReplyVO.setFid(null);
            rootReplyVO.setrTime(new Date());
            replyService.addRootReply(rootReplyVO);
            return ApiRes.ok("success");
        }
        return ApiRes.fail("失败");
    }

    @PostMapping("/addSonReply")
    @ApiOperation("添加子评论")
    public ApiRes addSonReply(@RequestBody ReplyVO replyVO) {
        if (replyVO.getrContents().length() != 0){
//            replyVO.setFid(1);
            replyVO.setrTime(new Date());
            replyService.addReply(replyVO);
            return ApiRes.ok("success");
        }
        return ApiRes.fail("fail");
    }


}

package com.clock.controller;

import com.clock.bean.vo.ReplyVO;
import com.clock.bean.vo.RootReplyVO;
import com.clock.service.ReplyService;
import com.clock.util.ApiRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/reply")
@Api("回复api")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @RequestMapping("/selectUserReply")
    @ApiOperation("获取当前动态的评论")
    public ApiRes selectUserReply(Integer did){
//        RootReplyVO volist = new RootReplyVO();
//        获取所有一二级评论，分开数组存放
//        List<RootReplyVO> RootReplys = replyService.selectRootReply(did);
//        List<ReplyVO> SonReplys = replyService.selectSonReply(did);

//        List<ReplyVO> RealSonReplys = new ArrayList();
//        取出一级评论的所有rid作为集合
//        List<Integer> ridList = RootReplys.stream().map(RootReplyVO::getRid).collect(Collectors.toList());
//        List<Integer> fidList = SonReplys.stream().map(ReplyVO::getFid).collect(Collectors.toList());

//        for (int i=0; i<ridList.size(); i++){
//            for (int j=0; j<fidList.size(); j++){
//                if (ridList.get(i).equals(fidList.get(j))){
////                    获取符合条件的fid，调用sql查询出相应的二级评论值,把结果存进二级评论对象数组里。
//                    int realSec = fidList.get(j);
//                    List<ReplyVO> list = replyService.selectSonReply(realSec);
//                    ReplyVO replyVO = new ReplyVO();
//                    replyVO.setSonReply(list);
//                    RealSonReplys.add(replyVO);
//                }
//            }
//        }
//        volist.setRootReplyVOS(RootReplys);
//        volist.setReplyVO(RealSonReplys);
        return ApiRes.ok(replyService.selectUserReply(did));
    }

    @PostMapping("/addRootReply")
    @ApiOperation("添加父评论")
    public ApiRes addRootReply(RootReplyVO rootReplyVO) {
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
    public ApiRes addSonReply(ReplyVO replyVO) {
        if (replyVO.getrContents().length() != 0){
            replyVO.setFid(1);
            replyVO.setrTime(new Date());
            replyService.addReply(replyVO);
            return ApiRes.ok("success");
        }
        return ApiRes.fail("fail");
    }


}

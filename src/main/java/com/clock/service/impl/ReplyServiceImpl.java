package com.clock.service.impl;

import com.clock.bean.Dynamic;
import com.clock.bean.Reply;
import com.clock.bean.vo.ReplyVO;
import com.clock.bean.vo.RootReplyVO;
import com.clock.dao.ReplyMapper;
import com.clock.service.ReplyService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public ApiRes selectUserReply(Integer did) {
        if (did==null || did.equals("")){
            return ApiRes.fail("did为空值");
        }
        List<RootReplyVO> list = replyMapper.selectUserReply(did);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes deleteReply(Integer rid) {
        replyMapper.deleteByPrimaryKey(rid);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes addRootReply(RootReplyVO rootReplyVO) {
//        List<RootReplyVO> list = replyMapper.addRootComments(rootReplyVO);
//        System.out.println(list);
        replyMapper.addRootComments(rootReplyVO);
        return ApiRes.ok("succeed");
    }

    @Override
    public ApiRes addReply(ReplyVO replyVO) {
//        List<ReplyVO> list = replyMapper.addSonComments(replyVO);
        replyMapper.addSonComments(replyVO);
        return ApiRes.ok("succeed");
    }

    @Override
    public List<RootReplyVO> selectRootReply(Integer did) {
        List<RootReplyVO> list = replyMapper.selectRootReply(did);
        return list;
    }

    @Override
    public List<ReplyVO> selectSonReply(Integer did) {
        List<ReplyVO> list = replyMapper.selectSonReply(did);
        return list;
    }

    @Override
    public ApiRes updateReplyCount(Integer did) {
        replyMapper.updateReplyNum(did);
        return ApiRes.ok("success");
    }

}

package com.clock.service.impl;

import com.clock.bean.Reply;
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
        List<Reply> list = replyMapper.selectUserReply(did);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes deleteReply(Integer rid) {
        replyMapper.deleteByPrimaryKey(rid);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes addReply(Reply reply) {
        replyMapper.insertSelective(reply);
        return ApiRes.ok("success");
    }
}

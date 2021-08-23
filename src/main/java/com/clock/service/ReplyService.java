package com.clock.service;

import com.clock.bean.Reply;
import com.clock.bean.vo.ReplyVO;
import com.clock.bean.vo.RootReplyVO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReplyService {

//    获取该动态下的所有评论
    ApiRes selectUserReply(Integer did);

    ApiRes deleteReply(Integer rid);

//    添加父评论
    ApiRes addRootReply(RootReplyVO rootReplyVO);

//    添加子评论
    ApiRes addReply(ReplyVO replyVO);

    List<RootReplyVO> selectRootReply(Integer did);

    List<ReplyVO> selectSonReply(Integer did);


}

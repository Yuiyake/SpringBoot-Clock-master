package com.clock.service;

import com.clock.bean.Reply;
import com.clock.bean.Type;
import com.clock.bean.po.TypePO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface ReplyService {

    ApiRes selectUserReply(Integer did);

    ApiRes deleteReply(Integer rid);

    ApiRes addReply(Reply reply);


}

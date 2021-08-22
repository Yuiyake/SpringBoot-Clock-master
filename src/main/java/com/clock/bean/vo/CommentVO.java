package com.clock.bean.vo;

import lombok.Data;

import java.util.List;

// 父评论vo层
@Data
public class CommentVO {

    private Integer rid;

    private Integer uid;

    private String uname;

    private String rTime;

    private String rContents;

    private List<ReplyVO> replyVO;

}

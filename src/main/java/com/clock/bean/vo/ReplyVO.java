package com.clock.bean.vo;

import lombok.Data;
// 子评论vo层
@Data
public class ReplyVO {

    private Integer rid;

    private Integer uid;

    private String uname;

    private String replyUserName;

    private Integer replyUserId;

    private String rTime;

    private String rContents;

}

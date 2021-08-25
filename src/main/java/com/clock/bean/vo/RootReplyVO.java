package com.clock.bean.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

// 父评论vo层
@Data
public class RootReplyVO {

    private Integer rid;

    private Integer did;

    private Integer fid;

    private Integer fromuid;

//    private String fromname;

    private Integer touid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
    }

//    public String getFromname() {
//        return fromname;
//    }
//
//    public void setFromname(String fromname) {
//        this.fromname = fromname;
//    }

    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }

//    public String getToname() {
//        return toname;
//    }
//
//    public void setToname(String toname) {
//        this.toname = toname;
//    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public String getrContents() {
        return rContents;
    }

    public void setrContents(String rContents) {
        this.rContents = rContents;
    }


//    private String toname;

    private Date rTime;

    private String rContents;


    public List<ReplyVO> getReplyVOS() {
        return replyVOS;
    }

    public void setReplyVOS(List<ReplyVO> replyVOS) {
        this.replyVOS = replyVOS;
    }

    //    存放子评论的集合
    private List<ReplyVO> replyVOS;

}

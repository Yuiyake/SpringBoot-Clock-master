package com.clock.bean.vo;

import lombok.Data;
import lombok.Generated;

import java.util.Date;
import java.util.List;

// 父评论vo层
@Data
public class RootReplyVO {

    private Integer rid;

    private Integer did;

    private Integer fid;

    private Integer fromuid;

    public String getFromuname() {
        return fromuname;
    }

    public void setFromuname(String fromuname) {
        this.fromuname = fromuname;
    }

    private String fromuname;

    private Integer touid;

    private String uavg;


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


    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }


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


    public String getTouname() {
        return touname;
    }

    public void setTouname(String touname) {
        this.touname = touname;
    }

    private String touname;

    private Date rTime;

    private String rContents;

    public String getUavg() {
        return uavg;
    }

    public void setUavg(String uavg) {
        this.uavg = uavg;
    }


    public List<ReplyVO> getReplyVOS() {
        return replyVOS;
    }

    public void setReplyVOS(List<ReplyVO> replyVOS) {
        this.replyVOS = replyVOS;
    }

    //    存放子评论的集合
    private List<ReplyVO> replyVOS;

}

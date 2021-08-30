package com.clock.bean.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

// 子评论vo层
@Data
public class ReplyVO {

    private Integer rid;

    private Integer did;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    private Integer fid;

    private Integer fromuid;

    private String fromuname;

    private Integer touid;

    private String touname;

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    private Date rTime;

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

    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
    }

    public String getFromuname() {
        return fromuname;
    }

    public void setFromuname(String fromuname) {
        this.fromuname = fromuname;
    }

    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }

    public String getTouname() {
        return touname;
    }

    public void setTouname(String touname) {
        this.touname = touname;
    }


    public String getrContents() {
        return rContents;
    }

    public void setrContents(String rContents) {
        this.rContents = rContents;
    }

    private String rContents;

    public List<ReplyVO> getSonReply() {
        return sonReply;
    }

    public void setSonReply(List<ReplyVO> sonReply) {
        this.sonReply = sonReply;
    }

    private List<ReplyVO> sonReply;



}

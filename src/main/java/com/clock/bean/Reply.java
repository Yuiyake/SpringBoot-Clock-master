package com.clock.bean;

import com.clock.bean.vo.ReplyVO;

import java.util.Date;
import java.util.List;

public class Reply {
    private Integer rid;

    private Integer did;

    private Integer fid;

    private Integer fromuid;

    private Integer touid;

    private Date rtime;

    private String        rcontents;

    private List<ReplyVO> listCommentsReply;

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

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getRcontents() {
        return rcontents;
    }

    public void setRcontents(String rcontents) {
        this.rcontents = rcontents == null ? null : rcontents.trim();
    }

}
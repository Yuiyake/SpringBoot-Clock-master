package com.clock.bean;

import java.util.Date;

public class Reply {
    private Integer rid;

    private Integer did;

    private Integer uid;

    private Date rtime;

    private String rcontents;

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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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
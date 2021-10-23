package com.clock.bean;

import java.util.Date;

public class Dynamic {
    private Integer did;

    private Integer tid;

    private Integer uid;

    private Date dtime;

    private Integer support;

    private Integer dreplycount;

    private String dimg;

    private String dconcern;

    private String username;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getDreplycount() {
        return dreplycount;
    }

    public void setDreplycount(Integer dreplycount) {
        this.dreplycount = dreplycount;
    }

    public String getDimg() {
        return dimg;
    }

    public void setDimg(String dimg) {
        this.dimg = dimg == null ? null : dimg.trim();
    }

    public String getDconcern() {
        return dconcern;
    }

    public void setDconcern(String dconcern) {
        this.dconcern = dconcern == null ? null : dconcern.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
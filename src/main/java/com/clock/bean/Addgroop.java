package com.clock.bean;

public class Addgroop {
    private Integer gid;

    private Integer uid;

    private String uclockstate;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUclockstate() {
        return uclockstate;
    }

    public void setUclockstate(String uclockstate) {
        this.uclockstate = uclockstate == null ? null : uclockstate.trim();
    }
}
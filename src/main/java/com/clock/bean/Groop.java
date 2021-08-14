package com.clock.bean;

public class Groop {
    private Integer gid;

    private String gname;

    private String clocktype;

    private Integer gnum;

    private Integer clocknum;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getClocktype() {
        return clocktype;
    }

    public void setClocktype(String clocktype) {
        this.clocktype = clocktype == null ? null : clocktype.trim();
    }

    public Integer getGnum() {
        return gnum;
    }

    public void setGnum(Integer gnum) {
        this.gnum = gnum;
    }

    public Integer getClocknum() {
        return clocknum;
    }

    public void setClocknum(Integer clocknum) {
        this.clocknum = clocknum;
    }
}
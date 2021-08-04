package com.clock.bean;

public class Group {
    private Integer gid;

    private String gname;

    private String clocktype;

    private Integer g_num;

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

    public Integer getgNum() {
        return g_num;
    }

    public void setgNum(Integer g_num) {
        this.g_num = g_num;
    }
}
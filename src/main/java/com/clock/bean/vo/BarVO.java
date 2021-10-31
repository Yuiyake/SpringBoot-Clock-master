package com.clock.bean.vo;

import java.util.List;

public class BarVO {

    public List<Integer> getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(List<Integer> groupnum) {
        this.groupnum = groupnum;
    }

    public List<DataVO> getValues() {
        return values;
    }

    public void setValues(List<DataVO> values) {
        this.values = values;
    }

    public List<Integer> getClocknum() {
        return clocknum;
    }

    public void setClocknum(List<Integer> clocknum) {
        this.clocknum = clocknum;
    }

    public List<String> getGroupname() {
        return groupname;
    }

    public void setGroupname(List<String> groupname) {
        this.groupname = groupname;
    }

    private List<Integer> groupnum;
    private List<Integer> clocknum;
    private List<String> groupname;
    private List<DataVO> values;
}

package com.clock.bean.vo;

import java.util.List;
import java.util.Map;

public class DataVO {
    public List<Integer> getValue() {
        return value;
    }

    public void setValue(List<Integer> value) {
        this.value = value;
    }

    public Map<String, String> getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(Map<String, String> itemStyle) {
        this.itemStyle = itemStyle;
    }

    private List<Integer> value;
    private Map<String, String> itemStyle;
}

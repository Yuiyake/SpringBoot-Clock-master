package com.clock.bean;

import java.util.Date;

public class User {
    private Integer id;

    private String role;

    private String username;

    private String password;

    private String account;

    private String sex;

    private String isclock;

    private Integer clockday;

    private String state;

    private Date createtime;

    private String uavg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIsclock() {
        return isclock;
    }

    public void setIsclock(String isclock) {
        this.isclock = isclock == null ? null : isclock.trim();
    }

    public Integer getClockday() {
        return clockday;
    }

    public void setClockday(Integer clockday) {
        this.clockday = clockday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUavg() {
        return uavg;
    }

    public void setUavg(String uavg) {
        this.uavg = uavg == null ? null : uavg.trim();
    }
}
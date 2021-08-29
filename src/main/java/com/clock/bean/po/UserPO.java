package com.clock.bean.po;

import com.clock.util.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class UserPO extends PageParam {

    private Integer id;

    private String role;

    private String username;

    private String password;

    private String account;

    private String sex;

    private Integer typeId;

    private Integer groupId;

    private String state;

    private Date createtime;

    private String uavg;
}


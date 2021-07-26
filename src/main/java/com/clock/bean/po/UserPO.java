package com.clock.bean.po;

import com.clock.util.PageParam;
import lombok.Data;

@Data
public class UserPO extends PageParam {

    private String username;

    private String account;

    private String role;
}


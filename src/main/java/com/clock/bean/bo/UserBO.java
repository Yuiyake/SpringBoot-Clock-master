package com.clock.bean.bo;

import com.clock.bean.User;
import lombok.Data;

@Data
public class UserBO extends User {
    private Integer type;
    private Integer group;
    private Integer score;
}

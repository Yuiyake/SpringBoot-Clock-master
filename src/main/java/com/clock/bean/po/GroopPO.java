package com.clock.bean.po;

import com.clock.util.PageParam;
import lombok.Data;

@Data
public class GroopPO extends PageParam {

    private Integer gId;

    private String gname;

    private String clocktype;

    private Integer gnum;

    private Integer clocknum;

}

package com.clock.service;

import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.bean.vo.BarVO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    ApiRes selectAllGroups(GroopPO param);
    ApiRes selectByGroupName(GroopPO po);
    ApiRes updateGroup(Groop groop);
    ApiRes userAddGroup(Groop groop);
    ApiRes userQuitGroup(Integer gid);
    ApiRes changeGroupNum(Integer gid);
    public BarVO barVOList();
    ApiRes changeClockNum(Integer gid);
}

package com.clock.service;

import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    ApiRes selectAllGroups(GroopPO param);
    ApiRes updateGroup(Groop groop);
    ApiRes userAddGroup(Groop groop);
}

package com.clock.service;

import com.clock.bean.Group;
import com.clock.bean.po.GroupPO;
import com.clock.util.ApiRes;

public interface GroupService {
    ApiRes selectAllGroups(GroupPO param);
}

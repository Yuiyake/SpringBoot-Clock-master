package com.clock.service;

import com.clock.bean.Addgroop;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface AddGroupService {

    ApiRes selectMyGroups(Integer uid);

//    ApiRes userJoinGroup(Integer gid, Integer uid);
    ApiRes userJoinGroup(Addgroop addgroop);


}

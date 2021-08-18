package com.clock.service.impl;

import com.clock.bean.Addgroop;
import com.clock.dao.AddgroopMapper;
import com.clock.service.AddGroupService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddGroupServiceImpl implements AddGroupService {
    @Autowired
    private AddgroopMapper addgroopMapper;

    //    用户查询自己的小组
    @Override
    public ApiRes selectMyGroups(Integer uid) {
        List<Addgroop> list = addgroopMapper.selectMyGroups(uid);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes userQuitGroup(Integer uid, Integer gid) {
        addgroopMapper.userQuitGroup(uid, gid);
        return ApiRes.ok("success");
    }

    //    用户加入小组
    @Override
    public ApiRes userJoinGroup(Integer uid, Integer gid) {
        addgroopMapper.insertGroup(uid, gid);
        return ApiRes.ok("success");
    }
}

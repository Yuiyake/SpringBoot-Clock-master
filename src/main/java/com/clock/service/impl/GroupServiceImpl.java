package com.clock.service.impl;

import com.clock.bean.Group;
import com.clock.bean.bo.GroupBO;
import com.clock.bean.bo.UserBO;
import com.clock.bean.po.GroupPO;
import com.clock.dao.GroupMapper;
import com.clock.dao.TypeMapper;
import com.clock.service.GroupService;
import com.clock.util.ApiRes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public ApiRes selectAllGroups(GroupPO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<GroupBO> list = groupMapper.selectAllGroup(po);
            PageInfo<GroupBO> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<GroupBO> list = groupMapper.selectAllGroup(po);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes updateGroup(Group group) {
        groupMapper.updateByPrimaryKey(group);
        return ApiRes.ok("success");
    }
}

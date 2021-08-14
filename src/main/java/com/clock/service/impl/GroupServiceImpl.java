package com.clock.service.impl;

import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.dao.GroopMapper;
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
    private GroopMapper groupMapper;

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public ApiRes selectAllGroups(GroopPO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<Groop> list = groupMapper.selectAllGroup(po);
            PageInfo<Groop> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<Groop> list = groupMapper.selectAllGroup(po);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes updateGroup(Groop group) {
        groupMapper.updateByPrimaryKey(group);
        return ApiRes.ok("success");
    }
}

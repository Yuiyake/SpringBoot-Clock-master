package com.clock.service.impl;

import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.bean.vo.BarVO;
import com.clock.bean.vo.DataVO;
import com.clock.dao.AddgroopMapper;
import com.clock.dao.GroopMapper;
import com.clock.dao.TypeMapper;
import com.clock.service.GroupService;
import com.clock.util.ApiRes;
import com.clock.util.DataUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.unit.DataUnit;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroopMapper groupMapper;

    @Autowired
    AddgroopMapper addgroopMapper;

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
    public ApiRes selectByGroupName(GroopPO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<Groop> list = groupMapper.selectByName(po);
            PageInfo<Groop> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<Groop> list = groupMapper.selectByName(po);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes updateGroup(Groop group) {
        groupMapper.updateByPrimaryKey(group);
        return ApiRes.ok("success");
    }


//    用户创建小组
    @Override
    public ApiRes userAddGroup(Groop groop) {
        String gname = groop.getGname();
        String g = groupMapper.selectName(gname);
        System.out.println(g);
        System.out.println(gname);
        if(!gname.equals(g)){
            groupMapper.userCreateGroup(groop);
            int gid = groop.getGid();
            return ApiRes.ok(gid);
        }
        return ApiRes.fail("小组名不能重复！");
    }

    @Override
    public ApiRes userQuitGroup(Integer gid) {
        groupMapper.quitGnum(gid);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes changeGroupNum(Integer gid) {
        groupMapper.changeGnum(gid);
        return ApiRes.ok("success");
    }

    @Override
    public BarVO barVOList() {
        BarVO barVO = new BarVO();
        List<Integer> groupnum = new ArrayList<>();
        List<Integer> clocknum = new ArrayList<>();
        List<String> groupname = new ArrayList<>();
        List<Groop> groops = this.groupMapper.selectBarGroup();
        for (Groop groop:groops){
            groupname.add(groop.getGname());
            groupnum.add(groop.getGnum());
            clocknum.add(groop.getClocknum());
        }
        barVO.setGroupname(groupname);
        barVO.setGroupnum(groupnum);
        barVO.setClocknum(clocknum);
        return barVO;
    }

    @Override
    public ApiRes changeClockNum(Integer gid) {
        groupMapper.changeClockNum(gid);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes delGroup(Integer gid) {
        groupMapper.deleteByPrimaryKey(gid);
        addgroopMapper.deleteByGid(gid);
        return ApiRes.ok("success");
    }
}

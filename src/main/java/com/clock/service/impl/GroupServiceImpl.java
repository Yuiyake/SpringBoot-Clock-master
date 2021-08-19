package com.clock.service.impl;

import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.bean.vo.BarVO;
import com.clock.bean.vo.DataVO;
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


//    用户创建小组
    @Override
    public ApiRes userAddGroup(Groop groop) {
        groupMapper.userCreateGroup(groop);
        return ApiRes.ok("success");
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
        List<DataVO> values = new ArrayList<>();
        List<Groop> groops = this.groupMapper.selectBarGroup();
        for (Groop groop:groops){
            groupnum.add(groop.getGnum());
            clocknum.add(groop.getClocknum());
            DataVO dataVO = new DataVO();
            dataVO.setValue(clocknum);
            dataVO.setValue(groupnum);
//            dataVO.setItemStyle(DataUtil.createItemStyle(groop.getGnum()));
//            dataVO.setItemStyle(DataUtil.createItemStyle(groop.getClocknum()));
            values.add(dataVO);
        }
        barVO.setGroupnum(groupnum);
        barVO.setClocknum(clocknum);
        barVO.setValues(values);
        return barVO;
    }
}

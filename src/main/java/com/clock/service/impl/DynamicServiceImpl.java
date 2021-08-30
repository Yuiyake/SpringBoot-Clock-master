package com.clock.service.impl;

import com.clock.bean.Dynamic;
import com.clock.bean.bo.DynamicBO;
import com.clock.bean.po.DynamicPO;
import com.clock.dao.DynamicMapper;
import com.clock.dao.ReplyMapper;
import com.clock.service.DynamicService;
import com.clock.util.ApiRes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Autowired
     private ReplyMapper replyMapper;

    @Override
    public ApiRes selectAllDynamic(DynamicPO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<DynamicBO> list = dynamicMapper.selectAllDynamic(po);
            PageInfo<DynamicBO> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<DynamicBO> list = dynamicMapper.selectAllDynamic(po);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes deleteDynamic(Integer did) {
        dynamicMapper.deleteByPrimaryKey(did);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes selectUserDynamic(Integer uid) {
        List<Dynamic> list = dynamicMapper.selectUserDynamic(uid);
        dynamicMapper.selectUserDynamic(uid);
        return ApiRes.ok(list);
    }

//    找出指定用户的单条动态
    @Override
    public ApiRes selectThisDynamic(Integer did) {
        List<Dynamic> list = dynamicMapper.selectThisDynamic(did);
        int fid = dynamicMapper.selectUidByDid(did);
        // 获取list里的所有uid
        List<Integer> zid = list.stream().map(Dynamic::getUid).collect(Collectors.toList());
        boolean z = zid.get(0).equals(fid);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes selectDynamicByName(DynamicPO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<DynamicPO> list = dynamicMapper.selectByName(po);
            PageInfo<DynamicPO> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<DynamicPO> list = dynamicMapper.selectByName(po);
        return ApiRes.ok(list);
    }

}

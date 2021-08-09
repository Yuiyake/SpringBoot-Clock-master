package com.clock.service.impl;

import com.clock.bean.Dynamic;
import com.clock.bean.Type;
import com.clock.bean.bo.DynamicBO;
import com.clock.bean.po.DynamicPO;
import com.clock.dao.DynamicMapper;
import com.clock.service.DynamicService;
import com.clock.util.ApiRes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicMapper dynamicMapper;

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
    public ApiRes selectThisDynamic(Integer uid) {
        List<Dynamic> list = dynamicMapper.selectThisDynamic(uid); 
        dynamicMapper.selectThisDynamic(uid);
        return ApiRes.ok(list);
    }
}

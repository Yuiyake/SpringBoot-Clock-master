package com.clock.service.impl;

import com.clock.bean.Group;
import com.clock.bean.Type;
import com.clock.bean.bo.GroupBO;
import com.clock.bean.bo.TypeBO;
import com.clock.bean.po.TypePO;
import com.clock.dao.TypeMapper;
import com.clock.service.TypeService;
import com.clock.util.ApiRes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public ApiRes selectAllType(TypePO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<Type> list = typeMapper.selectAllType(po);
            PageInfo<Type> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<Type> list = typeMapper.selectAllType(po);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes updateType(Type type) {
        typeMapper.updateByPrimaryKeySelective(type);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes deleteType(Integer tid) {
        typeMapper.deleteByPrimaryKey(tid);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes addType(Type type) {
        typeMapper.insertSelective(type);
        return ApiRes.ok("success");
    }


}

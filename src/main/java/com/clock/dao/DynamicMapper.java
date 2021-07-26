package com.clock.dao;

import com.clock.bean.Dynamic;
import com.clock.bean.DynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicMapper {
    long countByExample(DynamicExample example);

    int deleteByExample(DynamicExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    List<Dynamic> selectByExampleWithBLOBs(DynamicExample example);

    List<Dynamic> selectByExample(DynamicExample example);

    Dynamic selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByExampleWithBLOBs(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByExample(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKeyWithBLOBs(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}
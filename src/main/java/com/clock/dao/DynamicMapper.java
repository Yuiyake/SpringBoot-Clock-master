package com.clock.dao;

import com.clock.bean.Dynamic;
import com.clock.bean.DynamicExample;
import java.util.List;

import com.clock.bean.bo.DynamicBO;
import com.clock.bean.po.DynamicPO;
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

    List<DynamicBO> selectAllDynamic(DynamicPO po);

    List<Dynamic> selectUserDynamic(Integer uid);

    List<Dynamic> selectThisDynamic(Integer did);

    int selectUidByDid(Integer did);

    List<DynamicPO> selectByName(DynamicPO po);
}
package com.clock.dao;

import com.clock.bean.Type;
import com.clock.bean.TypeExample;
import java.util.List;

import com.clock.bean.po.TypePO;
import org.apache.ibatis.annotations.Param;

public interface TypeMapper {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    List<Type> selectAllType(TypePO po);

    Type selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> selectTypeById(Integer tid);
}
package com.clock.dao;

import com.clock.bean.Groop;
import com.clock.bean.GroopExample;
import java.util.List;

import com.clock.bean.po.GroopPO;
import org.apache.ibatis.annotations.Param;

public interface GroopMapper {
    long countByExample(GroopExample example);

    int deleteByExample(GroopExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Groop record);

    int insertSelective(Groop record);

    List<Groop> selectByExample(GroopExample example);

    Groop selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Groop record, @Param("example") GroopExample example);

    int updateByExample(@Param("record") Groop record, @Param("example") GroopExample example);

    int updateByPrimaryKeySelective(Groop record);

    int updateByPrimaryKey(Groop record);

    List<Groop> selectAllGroup(GroopPO po);

    int changeGnum(Integer gid);

    int userCreateGroup(Groop groop);
}
package com.clock.dao;

import com.clock.bean.Addgroop;
import com.clock.bean.AddgroopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddgroopMapper {
    long countByExample(AddgroopExample example);

    int deleteByExample(AddgroopExample example);

    int deleteByGid(Integer gid);

    int insert(Addgroop record);

    int insertSelective(Addgroop record);

    List<Addgroop> selectByExample(AddgroopExample example);

    int updateByExampleSelective(@Param("record") Addgroop record, @Param("example") AddgroopExample example);

    int updateByExample(@Param("record") Addgroop record, @Param("example") AddgroopExample example);

    List<Addgroop> selectMyGroups(Integer uid);

    int insertGroup(Integer uid, Integer gid);

    int userQuitGroup(Integer uid, Integer gid);

    int changeState(Integer uid, Integer gid);
}
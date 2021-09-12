package com.clock.dao;

import com.clock.bean.User;
import com.clock.bean.UserExample;
import java.util.List;

import com.clock.bean.bo.UserBO;
import com.clock.bean.po.UserPO;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    UserBO selectById(Integer id);

    List<UserBO> selectAllUser(UserPO po);

    List<UserBO> selectForbidUser(UserPO po);

    int forbidUser(Integer id);

    int recoveryUser(Integer id);

    int updateUserImg(User user);

    List<User> selectByUserId(Integer id);

    List<User> selectFUserById(UserPO po);

    List<User> selectAUser(UserPO po);

    int changeIsClock(Integer id);
}
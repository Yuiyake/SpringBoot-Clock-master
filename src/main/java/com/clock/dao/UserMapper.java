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

    List<User> selectByUserId(Integer id);

    int forbidUser(Integer id);

    int recoveryUser(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<UserBO> selectAllUser(UserPO po);

    UserBO selectById(Integer id);

    void updateByExample(User user);

    List<UserBO> selectForbidUser(UserPO po);

    int updateUserImg(User user);

    List<User> selectFUserById(UserPO po);

    List<User> selectAUser(Integer id, String username, String account);
}
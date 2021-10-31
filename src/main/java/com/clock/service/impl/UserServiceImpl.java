package com.clock.service.impl;

import com.clock.bean.User;
import com.clock.bean.UserExample;
import com.clock.bean.bo.UserBO;
import com.clock.bean.po.LoginPO;
import com.clock.bean.po.UserPO;
import com.clock.dao.ScoreMapper;
import com.clock.dao.UserMapper;
import com.clock.service.UserService;
import com.clock.util.ApiRes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public ApiRes login(LoginPO po) {
        UserExample example = new UserExample();
        example.createCriteria().andAccountEqualTo(po.getAccount()).andPasswordEqualTo(po.getPassword());
        List<User> users = userMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(users)){
            return ApiRes.fail("该用户不存在或者密码错误！");
        }
        User user = users.get(0);
        if ("0".equals(user.getRole())){
            return ApiRes.ok(user);
        } else if ("1".equals(user.getRole())){
            return ApiRes.ok(user);
        }
        User bo = userMapper.selectById(user.getId());
        return ApiRes.ok(bo);
    }

//添加
    @Override
    public ApiRes register(User user) {
            String userAccount = userMapper.selectUserByAcc(user.getAccount());
            System.out.println(userAccount);
            if(userAccount != null ){
                if(userAccount.equals(user.getAccount())){
                    return ApiRes.fail("账号不能重复！");
                }
            } else {
                user.setCreatetime(new Date());
                userMapper.insertSelective(user);
                return ApiRes.ok("success");
            }
        return ApiRes.fail("未知错误");
    }

    @Override
    public ApiRes selectAllUser(UserPO po) {
        if ("0".equals(po.getIsPage())) {
            List<UserBO> list = userMapper.selectAllUser(po);
            return ApiRes.ok(list);
        }
        PageHelper.startPage(po.getPageNum(),po.getPageSize());
        List<UserBO> list = userMapper.selectAllUser(po);
        PageInfo<UserBO> info = new PageInfo<>(list);
        return ApiRes.ok(info);
    }

    @Override
    public ApiRes selectForbidUser(UserPO po) {
        if ("0".equals(po.getIsPage())) {
            List<UserBO> list = userMapper.selectForbidUser(po);
            return ApiRes.ok(list);
        }
        PageHelper.startPage(po.getPageNum(),po.getPageSize());
        List<UserBO> list = userMapper.selectForbidUser(po);
        PageInfo<UserBO> info = new PageInfo<>(list);
        return ApiRes.ok(info);
    }

    @Override
    public ApiRes deleteUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes forbidUser(Integer id) {
        userMapper.forbidUser(id);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes recoveryUser(Integer id) {
        userMapper.recoveryUser(id);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes setUserAvg(User user) {
        userMapper.updateUserImg(user);
        return ApiRes.ok("success");
    }

    @Override
    public ApiRes selectUserById(Integer id) {
        List<User> list = userMapper.selectByUserId(id);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes selectFUserById(UserPO po) {
        if ("0".equals(po.getIsPage())) {
            List<User> list = userMapper.selectFUserById(po);
            return ApiRes.ok(list);
        }
        PageHelper.startPage(po.getPageNum(),po.getPageSize());
        List<User> list = userMapper.selectFUserById(po);
        PageInfo<User> info = new PageInfo<>(list);
        return ApiRes.ok(info);

    }

    @Override
    public ApiRes selectAUser(UserPO po) {
        if ("0".equals(po.getIsPage())) {
            List<User> list = userMapper.selectAUser(po);
            return ApiRes.ok(list);
        }
        PageHelper.startPage(po.getPageNum(),po.getPageSize());
        List<User> list = userMapper.selectAUser(po);
        PageInfo<User> info = new PageInfo<>(list);
        return ApiRes.ok(info);
    }

    // 用户打卡
    @Override
    public ApiRes changeIsClock(Integer id) {
        userMapper.changeIsClock(id);
        return ApiRes.ok("success");
    }
}

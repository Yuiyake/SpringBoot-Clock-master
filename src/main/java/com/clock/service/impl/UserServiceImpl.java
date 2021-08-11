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
        UserBO bo = userMapper.selectById(user.getId());
        return ApiRes.ok(bo);
    }

//添加
    @Override
    public ApiRes register(User user) {
        if ("0".equals(user.getRole())){
            userMapper.updateByPrimaryKeySelective(user);
        } else {
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
//            criteria.andAccountEqualTo(user.getAccount());
            if (user.getId()!=null)
                criteria.andIdNotEqualTo(user.getId());
            List<User> users = userMapper.selectByExample(example);
//            if (!CollectionUtils.isEmpty(users))
//                return ApiRes.fail("学号不能重复！");
//            System.out.println(user.getId());
//            if (user.getId()!=null) {
//                userMapper.updateByPrimaryKeySelective(user);
//                System.out.println("执行了这个if");
//                // 这里有问题，添加成员也会执行这个update，而不是添加
//            } else {
                userMapper.insertSelective(user);
//            }
        }
        return ApiRes.ok("success");
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
}

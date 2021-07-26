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
        }
        UserBO bo = userMapper.selectById(user.getId());
        return ApiRes.ok(bo);
    }

    @Override
    public ApiRes register(User user) {
        if ("0".equals(user.getRole())){
            userMapper.updateByPrimaryKeySelective(user);
        } else {
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
//            criteria.andAccountEqualTo(user.getAccount());
//            if (user.getId()!=null)
//                criteria.andIdNotEqualTo(user.getId());
            List<User> users = userMapper.selectByExample(example);
//            if (!CollectionUtils.isEmpty(users))
//                return ApiRes.fail("学号不能重复！");
            if (user.getId()!=null) {
                userMapper.updateByPrimaryKeySelective(user);
            } else {
                userMapper.insert(user);
            }
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
    public ApiRes deleteUser(Integer id) {
        return null;
    }
}

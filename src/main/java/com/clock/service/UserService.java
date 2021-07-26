package com.clock.service;

import com.clock.bean.User;
import com.clock.bean.po.LoginPO;
import com.clock.bean.po.UserPO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ApiRes login(LoginPO po);

    ApiRes register(User user);

    ApiRes selectAllUser(UserPO po);

    ApiRes deleteUser(Integer id);

}

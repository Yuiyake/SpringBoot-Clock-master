package com.clock.service;

import com.clock.bean.Type;
import com.clock.bean.po.TypePO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface TypeService {
    ApiRes updateType(Type type);

    ApiRes selectAllType(TypePO po);

    ApiRes deleteUser(Integer tid);

    ApiRes updateUser(Type type);
}

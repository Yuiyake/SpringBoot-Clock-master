package com.clock.service;

import com.clock.bean.Dynamic;
import com.clock.bean.po.DynamicPO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

//@Service
public interface DynamicService {

    ApiRes selectAllDynamic(DynamicPO po);

    ApiRes deleteDynamic(Integer did);

    ApiRes selectUserDynamic(Integer uid);

    ApiRes selectThisDynamic(Integer did);

    ApiRes selectDynamicByName(String username);

    ApiRes addUserDynamic(Dynamic dynamic);

}

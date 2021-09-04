package com.clock.service;

import com.clock.bean.Dynamic;
import com.clock.bean.po.DynamicPO;
import com.clock.bean.po.TypePO;
import com.clock.util.ApiRes;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

@Service
public interface DynamicService {

    ApiRes selectAllDynamic(DynamicPO po);

    ApiRes deleteDynamic(Integer did);

    ApiRes selectUserDynamic(Integer uid);

    ApiRes selectThisDynamic(Integer did);

    ApiRes selectDynamicByName(DynamicPO po);

    ApiRes addUserDynamic(Dynamic dynamic);

}

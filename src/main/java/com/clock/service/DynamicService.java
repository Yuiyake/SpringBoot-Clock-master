package com.clock.service;

import com.clock.bean.po.DynamicPO;
import com.clock.bean.po.TypePO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface DynamicService {

    ApiRes selectAllDynamic(DynamicPO po);

    ApiRes deleteDynamic(Integer did);

}

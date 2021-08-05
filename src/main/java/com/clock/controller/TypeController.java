package com.clock.controller;

import com.clock.bean.Group;
import com.clock.bean.Type;
import com.clock.bean.po.TypePO;
import com.clock.service.TypeService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @PostMapping("/selectAllType")
    public ApiRes selectAllType(@RequestBody TypePO typePO){
        return typeService.selectAllType(typePO);
    }

    @PostMapping("/updateType")
    public ApiRes updateType(@RequestBody Type type){
        return typeService.updateType(type);
    }

}

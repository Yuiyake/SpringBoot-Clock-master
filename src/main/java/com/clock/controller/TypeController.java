package com.clock.controller;

import com.clock.bean.Type;
import com.clock.bean.po.TypePO;
import com.clock.service.TypeService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @PostMapping("/selectAllType")
    public ApiRes selectAllType(@RequestBody TypePO typePO){
        return typeService.selectAllType(typePO);
    }

    @PostMapping("/addType")
    public ApiRes addType(@RequestBody Type type){
        return typeService.addType(type);
    }

    @PostMapping("/updateType")
    public ApiRes updateType(@RequestBody Type type){
        return typeService.updateType(type);
    }

    @GetMapping("/deleteType")
    public ApiRes deleteType(Integer tid) {
        return typeService.deleteType(tid);
    }

}

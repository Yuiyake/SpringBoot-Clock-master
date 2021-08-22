package com.clock.controller;

import com.clock.bean.po.DynamicPO;
import com.clock.service.DynamicService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dynamic")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;

    @PostMapping("/selectAllDynamic")
    public ApiRes selectAllDynamic(@RequestBody DynamicPO po) {
        return dynamicService.selectAllDynamic(po);
    }

    @GetMapping("/deleteDynamic")
    public ApiRes deleteDynamic(Integer did) {
        return dynamicService.deleteDynamic(did);
    }

    @RequestMapping("/selectUserDynamic")
    public ApiRes selectUserDynamic(Integer uid){
        return dynamicService.selectUserDynamic(uid);
    }

    @RequestMapping("/selectThisDynamic")
    public ApiRes selectThisDynamic(Integer did){
        return dynamicService.selectThisDynamic(did);
    }

}

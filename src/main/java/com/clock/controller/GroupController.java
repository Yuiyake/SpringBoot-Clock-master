package com.clock.controller;

import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.service.GroupService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping("/selectAllGroups")
    public ApiRes selectAllGroups(@RequestBody GroopPO po){
        return groupService.selectAllGroups(po);
    }

    @PostMapping("/updateGroup")
    public ApiRes updateGroup(@RequestBody Groop group){
        return groupService.updateGroup(group);
    }
}

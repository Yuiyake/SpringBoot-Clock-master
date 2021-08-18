package com.clock.controller;

import com.clock.bean.Addgroop;
import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.service.AddGroupService;
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

    @Autowired
    private AddGroupService addGroupService;

    @PostMapping("/selectAllGroups")
    public ApiRes selectAllGroups(@RequestBody GroopPO po){
        return groupService.selectAllGroups(po);
    }

    @PostMapping("/updateGroup")
    public ApiRes updateGroup(@RequestBody Groop group){
        return groupService.updateGroup(group);
    }

    @PostMapping("/userAddGroup")
    public ApiRes userAddGroup(@RequestBody Groop group) {
        return groupService.userAddGroup(group);
    }

    @RequestMapping("/selectMyGroups")
    public ApiRes selectMyGroups(Integer uid) {
        return addGroupService.selectMyGroups(uid);
    }

    @PostMapping("/userJoinGroup")
    public ApiRes userJoinGroup(Integer gid, Integer uid) {
        return addGroupService.userJoinGroup(uid, gid);
    }


}

package com.clock.controller;

import com.clock.bean.Addgroop;
import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.bean.vo.BarVO;
import com.clock.service.AddGroupService;
import com.clock.service.GroupService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/selectByGroupName")
    public ApiRes selectByGroupName(@RequestBody GroopPO po) {
        return groupService.selectByGroupName(po);
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

    @RequestMapping("/changeGnum")
    public ApiRes changeGnum(Integer gid){
        return groupService.changeGroupNum(gid);
    }

    @RequestMapping("/userQuitGroup")
    public ApiRes userQuitGroup(Integer uid, Integer gid){
        return addGroupService.userQuitGroup(uid, gid);
    }

    @RequestMapping("/userDeleteGnum")
    public ApiRes userDeleteGnum(Integer gid){
        return groupService.userQuitGroup(gid);
    }

    @GetMapping("/barvo")
    public BarVO barVO() {
        return groupService.barVOList();
    }
    @PostMapping("/userGroupClock")
    public ApiRes userGroupClock(Integer gid, Integer uid) {
        groupService.changeClockNum(gid);
        addGroupService.changeUClockState(uid, gid);
        return ApiRes.ok("success");
    }

}

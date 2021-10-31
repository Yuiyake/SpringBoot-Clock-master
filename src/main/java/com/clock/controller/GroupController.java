package com.clock.controller;

import com.clock.bean.Addgroop;
import com.clock.bean.Groop;
import com.clock.bean.po.GroopPO;
import com.clock.bean.vo.BarVO;
import com.clock.service.AddGroupService;
import com.clock.service.GroupService;
import com.clock.util.ApiRes;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
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
    @ApiOperation("添加父评论")
    public ApiRes selectAllGroups(@RequestBody GroopPO po){
        return groupService.selectAllGroups(po);
    }

    @PostMapping("/selectByGroupName")
    @ApiOperation("添加父评论")
    public ApiRes selectByGroupName(@RequestBody GroopPO po) {
        return groupService.selectByGroupName(po);
    }

    @PostMapping("/updateGroup")
    @ApiOperation("查询所有小组")
    public ApiRes updateGroup(@RequestBody Groop group){
        return groupService.updateGroup(group);
    }

    @RequestMapping("/userAddGroup")
    @ApiOperation("用户创建小组（groop）")
    public ApiRes userAddGroup(@RequestBody Groop group) {
//        GroopPO po1 = new GroopPO();
//        ApiRes groop1 = groupService.selectAllGroups(po1);
        return groupService.userAddGroup(group);
    }

    @DeleteMapping("/delGroup")
    @ApiOperation("管理员删除小组")
    public ApiRes delGroup(Integer gid){
        return groupService.delGroup(gid);
    }

    @PostMapping("/selectMyGroups")
    @ApiOperation("查找当前用户小组")
    public ApiRes selectMyGroups(Integer uid) {
        return addGroupService.selectMyGroups(uid);
    }

    @PostMapping("/userJoinGroup")
    @ApiOperation("用户加入小组（addgroop）")
    public ApiRes userJoinGroup(Integer gid, Integer uid) {
        return addGroupService.userJoinGroup(uid, gid);
    }

//    @RequestMapping(path="/changeGnum", method = RequestMethod.POST)
    @PostMapping("/changeGnum")
    @ApiOperation("更改小组数字")
    public ApiRes changeGnum(Integer gid){
        return groupService.changeGroupNum(gid);
    }

    @DeleteMapping("/userQuitGroup")
    @ApiOperation("用户退出小组（addgroop表）")
    public ApiRes userQuitGroup(Integer uid, Integer gid){
        return addGroupService.userQuitGroup(uid, gid);
    }

    @DeleteMapping("/userDeleteGnum")
    @ApiOperation("用户退出小组（groop表）")
    public ApiRes userDeleteGnum(Integer gid){
        return groupService.userQuitGroup(gid);
    }

    @GetMapping("/barvo")
    @ApiOperation("图表返回数据（结合ECharts）")
    public BarVO barVO() {
        return groupService.barVOList();
    }

    @PostMapping("/userGroupClock")
    @ApiOperation("用户打卡小组")
    public ApiRes userGroupClock(Integer gid, Integer uid) {
        groupService.changeClockNum(gid);
        addGroupService.changeUClockState(uid, gid);
        return ApiRes.ok("success");
    }

}

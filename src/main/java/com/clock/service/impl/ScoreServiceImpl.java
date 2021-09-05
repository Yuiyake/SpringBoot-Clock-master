package com.clock.service.impl;

import com.clock.bean.Score;
import com.clock.bean.bo.DynamicBO;
import com.clock.bean.bo.ScoreBO;
import com.clock.bean.po.ScorePO;
import com.clock.dao.ScoreMapper;
import com.clock.service.ScoreService;
import com.clock.util.ApiRes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public ApiRes selectAllScore(ScorePO po) {
        if ("1".equals(po.getIsPage())) {
            PageHelper.startPage(po.getPageNum(),po.getPageSize());
            List<Score> list = scoreMapper.selectAllScore(po);
            PageInfo<Score> info = new PageInfo<>(list);
            return ApiRes.ok(info);
        }
        List<Score> list = scoreMapper.selectAllScore(po);
        return ApiRes.ok(list);
    }

    @Override
    public ApiRes selectUserScore(Integer uid) {
        List<ScoreBO> list = scoreMapper.selectScoreByUid(uid);
        return ApiRes.ok(list);
    }

    //  用户补签
    @Override
    public ApiRes userRepair(Integer uid) {
        scoreMapper.userRepair(uid);
        return ApiRes.ok("success");
    }

    // 用户打卡
    @Override
    public ApiRes userClock(Integer uid) {
        scoreMapper.userClock(uid);
        return ApiRes.ok("success");
    }

    // 用户小组打卡
    @Override
    public ApiRes userGroupClock(Integer uid) {
        scoreMapper.userGroupClock(uid);
        return ApiRes.ok("success");
    }
}

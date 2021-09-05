package com.clock.service;

import com.clock.bean.Score;
import com.clock.bean.po.ScorePO;
import com.clock.util.ApiRes;
import org.springframework.stereotype.Service;

@Service
public interface ScoreService {

    ApiRes selectAllScore(ScorePO po);

    ApiRes selectUserScore(Integer uid);

    ApiRes userRepair(Integer uid);

    ApiRes userClock(Integer uid);

    ApiRes userGroupClock(Integer uid);
}

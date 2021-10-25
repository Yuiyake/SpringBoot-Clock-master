package com.clock.controller;

import com.clock.bean.po.ScorePO;
import com.clock.service.ScoreService;
import com.clock.util.ApiRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/selectAllScore")
    public ApiRes selectAllScore(@RequestBody ScorePO scorePO) {
        return scoreService.selectAllScore(scorePO);
    }

    @PostMapping("/selectUserScore")
    public ApiRes selectUserScore(Integer uid) {
        return scoreService.selectUserScore(uid);
    }

}

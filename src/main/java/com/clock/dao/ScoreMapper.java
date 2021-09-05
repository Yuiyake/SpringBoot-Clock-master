package com.clock.dao;

import com.clock.bean.Score;
import com.clock.bean.ScoreExample;
import java.util.List;

import com.clock.bean.bo.ScoreBO;
import com.clock.bean.po.ScorePO;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    long countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    List<Score> selectAllScore(ScorePO po);

    List<ScoreBO> selectScoreByUid(Integer uid);

    int userRepair(Integer uid);

    int userClock(Integer uid);

    int userGroupClock(Integer uid);
}
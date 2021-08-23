package com.clock.dao;

import com.clock.bean.Reply;
import com.clock.bean.ReplyExample;
import java.util.List;

import com.clock.bean.vo.ReplyVO;
import com.clock.bean.vo.RootReplyVO;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    long countByExample(ReplyExample example);

    int deleteByExample(ReplyExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Reply record);

    int insertSelective(Reply record);

    List<Reply> selectByExampleWithBLOBs(ReplyExample example);

    List<Reply> selectByExample(ReplyExample example);

//    查找该动态下所有父级评论
    List<RootReplyVO> selectRootReply(Integer did);

    //    查找该动态下所有子级评论
    List<ReplyVO> selectSonReply(Integer did);

    Reply selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);

    List<Reply> selectUserReply(Integer did);

    List<RootReplyVO> addRootComments(RootReplyVO rootReplyVO);

    List<ReplyVO> addSonComments(ReplyVO replyVO);

    List<ReplyVO> selectSonReplyByFid(Integer fid);
}
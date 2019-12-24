package com.jnshu.service;

import com.jnshu.pojo.Reply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pipiretrak
 * @date 2019/3/19 - 9:31
 */
public interface ReplyService {
    int deleteByPrimaryKey(Long replyId);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Long replyId);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);

    List<Reply> selectByDynamic(@Param("replyId")Long replyId, @Param("replyName")String replyName);

    Reply selectmsgId(Long msgId);
}

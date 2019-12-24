package com.jnshu.dao;

import com.jnshu.model.Checks;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChecksDao {
    int deleteById(Integer id);

    int insert(Checks record);

    int insertSelective(Checks record);

    Checks selectById(Integer id);

    int updateByIdSelective(Checks record);

    int updateById(Checks record);

    List<Checks> selectAll();
}
package com.guoxi.module.dao;

import com.guoxi.module.dao.Analysis;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnalysisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Analysis record);

    int insertSelective(Analysis record);

    Analysis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Analysis record);

    int updateByPrimaryKey(Analysis record);
}
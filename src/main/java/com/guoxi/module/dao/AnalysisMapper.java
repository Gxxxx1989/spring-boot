package com.guoxi.module.dao;

import com.guoxi.module.dao.Analysis;

public interface AnalysisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Analysis record);

    int insertSelective(Analysis record);

    Analysis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Analysis record);

    int updateByPrimaryKey(Analysis record);
}
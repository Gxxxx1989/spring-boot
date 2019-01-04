package com.guoxi.module.dao;

import com.guoxi.module.dao.BidInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BidInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BidInfo record);

    int insertSelective(BidInfo record);

    BidInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BidInfo record);

    int updateByPrimaryKey(BidInfo record);
}
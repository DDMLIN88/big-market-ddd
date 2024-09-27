package com.ddm.infrastructure.persistent.dao;

import com.ddm.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 策略表DAO
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();
}

package com.ddm.domain.strategy.repository;

import com.ddm.domain.strategy.model.entity.StrategyAwardEntity;
import com.ddm.domain.strategy.model.entity.StrategyEntity;
import com.ddm.domain.strategy.model.entity.StrategyRuleEntity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * @author: ddm
 * @description: 策略仓储接口
 * @date: 2024/10/2 19:05
 */
public interface IStrategyRepository {

    /**
     * 查询策略奖品列表
     * @param strategyId 策略ID
     * @return 策略奖品列表
     */
    List<StrategyAwardEntity> queryStrateguAwardList(Long strategyId);

    /**
     * 存储策略奖品抽奖概率表
     * @param key key值
     * @param rateRange 抽奖概率表区间
     * @param shuffleStrategyAwardSearchRateTables 策略奖品抽奖概率表
     */
    void storeStrategyAwardSearchRateTables(String key, Integer rateRange, HashMap<Integer, Integer> shuffleStrategyAwardSearchRateTables);

    /**
     * 获取策略奖品抽奖概率表区间
     * @param strategyId 策略ID
     * @return 策略奖品抽奖概率表区间
     */
    int getRateRange(Long strategyId);

    int getRateRange(String key);

    /**
     * 获取策略奖品ID
     * @param key 策略key
     * @return 策略奖品ID
     */
    Integer getStrategyAwardAssemble(String key, int rateKey);

    /**
     * 根据策略ID查询策略实体
     * @param strategyId 策略ID
     * @return 策略实体
     */
    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    /**
     * 根据策略ID和规则权重查询策略规则实体
     * @param strategyId 策略ID
     * @param ruleModel 规则权重
     * @return 策略规则实体
     */
    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    /**
     * 根据策略ID和奖品ID和规则权重查询策略规则实体
     * @param strategyId 策略ID
     * @param awardId 奖品ID
     * @param ruleModel 规则权重
     * @return 策略规则实体
     */
    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);
}

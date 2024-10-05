package com.ddm.domain.strategy.service.armory;

/**
 * @author: ddm
 * @description: 策略抽奖调度
 * @date: 2024/10/4 11:24
 */
public interface IStrategyDispatch {

    /**
     * 获取随机奖品id
     * @param strategyId 策略id
     * @return 奖品id
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}

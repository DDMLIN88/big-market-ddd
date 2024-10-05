package com.ddm.domain.strategy.service.armory;

/**
 * @author: ddm
 * @date: 2024/10/2 18:04
 * @description: 策略装配库（兵工厂）,负责初始化策略计算
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置
     * @param strategyId 策略id
     * @return 装配结果
     */
    Boolean assembleLotteryStrategy(Long strategyId);
}

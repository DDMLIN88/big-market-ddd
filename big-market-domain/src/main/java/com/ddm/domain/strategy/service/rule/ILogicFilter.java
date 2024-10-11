package com.ddm.domain.strategy.service.rule;

import com.ddm.domain.strategy.model.entity.RuleActionEntity;
import com.ddm.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author: ddm
 * @description: 抽奖规则过滤接口
 * @date: 2024/10/5 11:07
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}

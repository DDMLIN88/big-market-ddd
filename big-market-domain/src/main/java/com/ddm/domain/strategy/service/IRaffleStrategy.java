package com.ddm.domain.strategy.service;

import com.ddm.domain.strategy.model.entity.RaffleAwardEntity;
import com.ddm.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * @author: ddm
 * @description: 抽奖策略接口
 * @date: 2024/10/5 10:47
 */
public interface IRaffleStrategy {

    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);

}

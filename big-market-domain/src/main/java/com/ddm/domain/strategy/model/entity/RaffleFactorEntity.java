package com.ddm.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ddm
 * @description: 抽奖因子实体
 * @date: 2024/10/5 10:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleFactorEntity {

    private String userId;
    private Long StrategyId;

}

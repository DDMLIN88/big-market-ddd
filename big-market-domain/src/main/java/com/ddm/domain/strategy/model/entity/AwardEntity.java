package com.ddm.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ddm
 * @description: 策略结果实体
 * @date: 2024/10/4 11:52
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AwardEntity {

    /** 用户ID */
    private String userId;
    /** 奖品ID */
    private Integer awardId;
}

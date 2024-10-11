package com.ddm.domain.strategy.model.entity;

import com.ddm.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import lombok.*;
import org.dom4j.rule.Rule;

/**
 * @author: ddm
 * @description: 规则动作实体
 * @date: 2024/10/5 11:11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity<T extends RuleActionEntity.RaffleEntity> {

    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();
    private String ruleModel;
    private T data;

    static public class RaffleEntity {

    }

    //抽奖之前
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public class RaffleBeforeEntity extends RaffleEntity {
        // 策略id
        private Long strategyId;
        //权重值Key：用于抽奖时可以选择权重抽奖
        private String ruleWeightValueKey;
        //奖品id
        private Integer awardId;
    }

    //抽奖之中
    static public class RaffleCenterEntity extends RaffleEntity {

    }

    //抽奖之后
    static public class RaffleAfterEntity extends RaffleEntity {

    }

}

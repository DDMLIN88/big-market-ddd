package com.ddm.domain.strategy.model.entity;

import com.ddm.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: ddm
 * @description: 策略实体
 * @date: 2024/10/4 11:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyEntity {

    /**抽奖策略id**/
    private Long strategyId;
    /**抽奖策略描述**/
    private String strategyDesc;
    /** 规则模型，rule配置的模型同步到此表，便于使用 **/
    private String ruleModels;

    /**
     * 获取规则模型数组
     * @return
     */
    public String[] ruleModels() {
        if(StringUtils.isBlank(ruleModels)) return null;
        return ruleModels.split(Constants.SPLIT);
    }

    /**
     * 获取权重规则
     * @return
     */
    public String getRuleWeight() {
        String[] ruleModels = this.ruleModels();
        for (String ruleModel : ruleModels) {
            if("rule_weight".equals(ruleModel)) return ruleModel;
        }
        return null;
    }
}

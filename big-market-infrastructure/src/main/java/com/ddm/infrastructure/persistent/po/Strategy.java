package com.ddm.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * 抽奖策略
 */
@Data
public class Strategy {

    /**自增id**/
    private Long id;
    /**抽奖策略id**/
    private Long strategyId;
    /**抽奖策略描述**/
    private String strategyDesc;
    /** 规则模型，rule配置的模型同步到此表，便于使用 **/
    private String rule_models;
    /**创建时间**/
    private Date createTime;
    /**修改时间**/
    private Date updateTime;
}

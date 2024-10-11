package com.ddm.test.domain;

import com.ddm.domain.strategy.service.armory.IStrategyArmory;
import com.ddm.domain.strategy.service.armory.IStrategyDispatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: ddm
 * @description:
 * @date: 2024/10/3 23:58
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryDispatchTest {

    @Resource
    private IStrategyArmory strategyArmory;
    @Resource
    private IStrategyDispatch strategyDispatch;

    @Before
    public void test_strategyArmory() {
        strategyArmory.assembleLotteryStrategy(100001L);
    }

    @Test
    public void test_getAssembleRandomVal() {
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100001L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100001L));
    }

    @Test
    public void test_getAssembleRandomVal_ruleWeightValue() {
        log.info("测试结果: {} - 6000策略配置", strategyDispatch.getRandomAwardId(100001L, "6000:102,103,104,105,106,107,108,109"));
        log.info("测试结果: {} - 6000策略配置", strategyDispatch.getRandomAwardId(100001L, "6000:102,103,104,105,106,107,108,109"));
    }
}

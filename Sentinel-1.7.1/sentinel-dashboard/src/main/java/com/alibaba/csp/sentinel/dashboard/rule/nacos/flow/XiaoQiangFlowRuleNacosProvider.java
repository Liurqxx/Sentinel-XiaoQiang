package com.alibaba.csp.sentinel.dashboard.rule.nacos.flow;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author HelloLiu
 * @ClassName: XiaoQiangFlowRuleNacosProvider
 * @Description: 流控规则提供者
 * @Date: 2020/5/1 19:33
 */
public class XiaoQiangFlowRuleNacosProvider implements DynamicRuleProvider<List<FlowRuleEntity>> {

    @Autowired
    private ConfigService configService;
    @Autowired
    private Converter<String, List<FlowRuleEntity>> converter;


    @Override
    public List<FlowRuleEntity> getRules(String appName) throws Exception {
        return null;
    }
}

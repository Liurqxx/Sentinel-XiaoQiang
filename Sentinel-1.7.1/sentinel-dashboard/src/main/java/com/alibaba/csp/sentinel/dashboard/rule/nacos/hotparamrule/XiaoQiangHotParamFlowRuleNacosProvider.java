package com.alibaba.csp.sentinel.dashboard.rule.nacos.hotparamrule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HelloLiu
 * @ClassName: XiaoQiangHotParamFlowRuleNacosProvider
 * @Description: 热点规则推送
 * @Date: 2020/5/1 19:33
 */
@Component("XiaoQiangHotParamFlowRuleNacosProvider")
public class XiaoQiangHotParamFlowRuleNacosProvider implements DynamicRuleProvider<List<ParamFlowRuleEntity>> {

    @Autowired
    private ConfigService configService;

    @Override
    public List<ParamFlowRuleEntity> getRules(String appName) throws Exception {
        return NacosConfigUtil.getRuleEntities4Nacos(
                configService,
                appName,
                NacosConfigUtil.PARAM_FLOW_DATA_ID_POSTFIX,
                ParamFlowRuleEntity.class
        );
    }
}

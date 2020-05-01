package com.alibaba.csp.sentinel.dashboard.rule.nacos.systemrule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HelloLiu
 * @ClassName: XiaoQiangHotParamFlowRuleNacosProvider
 * @Description: 系统规则推送
 * @Date: 2020/5/1 19:33
 */
@Component("XiaoQiangSysRuleNacosProvider")
public class XiaoQiangSysRuleNacosProvider implements DynamicRuleProvider<List<SystemRuleEntity>> {

    @Autowired
    private ConfigService configService;

    @Override
    public List<SystemRuleEntity> getRules(String appName) throws Exception {
        return NacosConfigUtil.getRuleEntities4Nacos(
                configService,
                appName,
                NacosConfigUtil.SYSTEM_FULE_DATA_ID_POSTFIX,
                SystemRuleEntity.class
        );
    }
}

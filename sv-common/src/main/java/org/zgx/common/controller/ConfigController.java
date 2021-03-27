package org.zgx.common.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取Nacos配置中心部分属性的控制器
 *
 * @author zgx
 * @date 2021/03/27
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    /**
     * 默认该测试值为false
     */
    @Value("${testReadConfig:false}")
    private boolean testReadConfig;

    /**
     * 访问路径： http://localhost:8319/api/config/getConfig
     * Nacos配置中心读取testReadConfig的值（返回值为true）
     *
     * @return testReadConfig(true)
     */
    @RequestMapping("/getConfig")
    public boolean getConfig() {
        return testReadConfig;
    }

}

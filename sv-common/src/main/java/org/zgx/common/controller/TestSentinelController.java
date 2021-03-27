package org.zgx.common.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * 测试Sentinel控制器
 *
 * @author zgx
 * @date 2021/03/27
 */
@RestController
@RequestMapping("/sentinel")
public class TestSentinelController {

    /**
     * 注解@SentinelResource对此资源（value="test_sentinel"）进行监控
     *
     * @return unknown
     */
    @RequestMapping(value = {"/test"}, method = {RequestMethod.GET})
    @SentinelResource(value = "test_sentinel")
    public String testSentinel() {
        String str = "Hi,Sentinel! Now is " + Instant.now();
        return str;
    }
}

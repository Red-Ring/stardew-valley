package org.zgx.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zgx.feign.service.RemoteClient;

/**
 * 测试远程调用服务接口控制器
 *
 * @author A80027
 * @date 2021/03/27
 */
@RestController
@RequestMapping("/remote")
public class TestFeignController {

    /**
     * 注入调用远程服务方法的接口
     */
    @Autowired
    private RemoteClient remoteClient;

    /**
     * 调用sv-common服务下的hello方法
     *
     * @return
     */
    @RequestMapping(value = {"/hello"}, method = {RequestMethod.GET})
    public String newHello() {
        return remoteClient.remoteHello();
    }

    /**
     * 同服务下方法
     *
     * @return
     */
    @RequestMapping(value = {"/test"}, method = {RequestMethod.GET})
    public String test() {
        return "success";
    }

}

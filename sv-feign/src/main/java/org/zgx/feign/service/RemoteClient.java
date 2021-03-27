package org.zgx.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 要调用的远程服务接口
 *
 * @author zgx
 * @date 2021/03/27
 */
@FeignClient(name = "sv-common")
public interface RemoteClient {

    /**
     * 调用的远程服务接口
     *
     * @return unknown
     */
    @GetMapping("/api/villager/hello")
    String remoteHello();
}

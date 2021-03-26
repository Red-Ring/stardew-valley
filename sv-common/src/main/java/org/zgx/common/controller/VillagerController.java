package org.zgx.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zgx.common.component.result.ResultInfo;
import org.zgx.common.domain.Villager;
import org.zgx.common.service.VillagerService;

import javax.annotation.Resource;

/**
 * 村民控制器
 *
 * @author zgx
 * @date 2021/03/26
 */
@RestController
@RequestMapping("/villager")
public class VillagerController {

    @Autowired
    private VillagerService villagerService;

    @RequestMapping(value = {"/hello"}, method = {RequestMethod.GET})
    public String hello() {
        return "Hello!";
    }

    @RequestMapping(value = {"/createVillager"}, method = {RequestMethod.POST})
    public ResultInfo createVillager(Villager villager) {
        return this.villagerService.createVillager(villager);
    }

    @RequestMapping(value = {"/deleteVillager"}, method = {RequestMethod.POST})
    public ResultInfo deleteVillager(Long villagerId) {
        return this.villagerService.deleteVillager(villagerId);
    }

    @RequestMapping(value = {"/updateVillager"}, method = {RequestMethod.POST})
    public ResultInfo updateVillager(Villager villager) {
        return this.villagerService.updateVillager(villager);
    }

    @RequestMapping(value = {"/retrieveVillager"}, method = {RequestMethod.POST})
    public ResultInfo retrieveVillager(Long villagerId) {
        return this.villagerService.retrieveVillager(villagerId);
    }

}

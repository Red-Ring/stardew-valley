package org.zgx.common.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zgx.common.component.result.ResultInfo;
import org.zgx.common.component.result.ResultUtils;
import org.zgx.common.domain.Villager;
import org.zgx.common.repository.VillagerRepository;
import org.zgx.common.service.VillagerService;

/**
 * 村民服务实现
 *
 * @author zgx
 * @date 2021/03/26
 */
@Service
public class VillagerServiceImpl implements VillagerService {

    private static final Logger logger = LoggerFactory.getLogger(VillagerServiceImpl.class);

    @Autowired
    private VillagerRepository villagerRepository;

    @Override
    public ResultInfo createVillager(Villager villager) {
        try {
            this.villagerRepository.save(villager);
            return ResultUtils.success("success");
        } catch (Exception e) {
            logger.info("fail");
            return ResultUtils.fail("fail");
        }
    }

    @Override
    public ResultInfo deleteVillager(Long villagerId) {
        try {
            this.villagerRepository.deleteById(villagerId);
            return ResultUtils.success("success");
        } catch (Exception e) {
            logger.info("fail");
            return ResultUtils.fail("fail");
        }
    }

    @Override
    public ResultInfo updateVillager(Villager villager) {
        try {
            this.villagerRepository.save(villager);
            return ResultUtils.success("success");
        } catch (Exception e) {
            logger.info("fail");
            return ResultUtils.fail("fail");
        }
    }

    @Override
    public ResultInfo retrieveVillager(Long villagerId) {
        return ResultUtils.success(this.villagerRepository.findByVillagerId(villagerId));
    }

}

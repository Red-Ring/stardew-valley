package org.zgx.common.service;

import org.zgx.common.component.result.ResultInfo;
import org.zgx.common.domain.Villager;

/**
 * 村民服务
 *
 * @author zgx
 * @date 2021/03/26
 */
public interface VillagerService {

    /**
     * 村民-增
     *
     * @param villager
     * @return
     */
    ResultInfo createVillager(Villager villager);

    /**
     * 村民-删
     *
     * @param villagerId
     * @return
     */
    ResultInfo deleteVillager(Long villagerId);

    /**
     * 村民-改
     *
     * @param villager
     * @return
     */
    ResultInfo updateVillager(Villager villager);

    /**
     * 村民-查
     *
     * @param villagerId
     * @return
     */
    ResultInfo retrieveVillager(Long villagerId);

}

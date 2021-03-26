package org.zgx.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zgx.common.domain.Villager;

/**
 * 村民DAO
 *
 * @author zgx
 * @date 2021/03/26
 */
public interface VillagerRepository extends JpaRepository<Villager, Long> {

    Villager findByVillagerId(Long villagerId);

}

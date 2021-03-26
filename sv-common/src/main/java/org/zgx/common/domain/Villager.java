package org.zgx.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sv_villager")
@SuppressWarnings("all")
public class Villager {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "villager_id")
    private Long villagerId;

    @Column(name = "villager_name")
    private String villagerName;

}

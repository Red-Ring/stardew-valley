package org.zgx.common.test.concurrent;

import java.util.Random;

/**
 * 红包类
 *
 * @author zgx
 */
public class RedEnvelope {

    /**
     * 总金额
     */
    private Integer totalAmount;

    /**
     * 总人数
     */
    private Integer totalNumber;

    /**
     * 抢红包
     *
     * @return
     */
    public synchronized Double grabRedEnvelope() {
        Random random = new Random();
        Integer Interval = totalAmount * 100 / totalNumber;
        Double stolenMoney = Double.valueOf(random.nextInt(Interval));
        Double actualStolenMoney = stolenMoney / 100;
//        totalAmount -=
        return null;
    }

}

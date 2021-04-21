package org.zgx.common.test.concurrent;

/**
 * 群友类
 *
 * @author zgx
 */
public class GroupFriend extends Thread {

    private RedEnvelope redEnvelope;

    public GroupFriend(RedEnvelope redEnvelope) {
        this.redEnvelope = redEnvelope;
    }

    @Override
    public void run() {

    }
}

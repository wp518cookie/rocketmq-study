package com.ping.wu.producer;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author wuping
 * @date 2019-07-02
 */

public class OnewayProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("rocketmq_demo");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        for (int i = 0; i < 10; i++) {
            Message msg = new Message("TopicTest",
                    "TagA",
                    ("Hello RocketMq " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.sendOneway(msg);
        }
        producer.shutdown();
    }
}

package com.ping.wu.producer.schedule;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;

/**
 * @author wuping
 * @date 2019-07-02
 */

public class ScheduledMessageProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("ExampleProducerGroup");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        int totalMessageToSend = 10;
        for (int i = 0; i < totalMessageToSend; i++) {
            Message message = new Message("ScheduledTopic", ("Hello scheduled message " + i).getBytes());
            message.setDelayTimeLevel(3);
            producer.send(message);
        }
        producer.shutdown();
    }
}

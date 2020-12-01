package com.liuyumao.kafka.quick;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Pattern;

public class KafkaConsumerQuickStart {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerQuickStart.class);

    public static void main(String[] args) {
        //创建消费者KafkaConsumer
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "CentOS_0:9092,CentOS_1:9092,CentOS_2:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.CLIENT_ID_CONFIG, "0");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "group0");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);

        //订阅相关的topic
        kafkaConsumer.subscribe(Pattern.compile("topic[0,9]"));

        //便利消息队列
        while (true) {
            ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofSeconds(1));
            if (!consumerRecords.isEmpty()) {
                Iterator<ConsumerRecord<String, String>> recordIterator = consumerRecords.iterator();
                while (recordIterator.hasNext()){
                    //获取一个消费消息
                    ConsumerRecord<String, String> record = recordIterator.next();
                    String topic = record.topic();
                    int partition = record.partition();
                    long offset = record.offset();

                    String key = record.key();
                    String value = record.value();
                    long timestamp = record.timestamp();

                    LOGGER.info("topic={}|partition={}|offset={}|key={}|value={}|timestamp={}",
                            topic,
                            partition,
                            offset,
                            key,
                            value,
                            timestamp);
                }
            }
        }

    }
}

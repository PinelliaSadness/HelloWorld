package com.liuyumao.kafka.partitioner;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerPartitioner {
    public static void main(String[] args) {
        //创建生产者KafkaProducer
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "CentOS_0:9092,CentOS_1:9092,CentOS_2:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //负载均衡策略,又默认的策略这里用的是我们自定义的策略
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, CustomDefinePartitioner.class.getName());

        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);

        for (int i=0; i<10; i++) {
            ProducerRecord<String, String> record = new ProducerRecord<>("topic_0", "key" + i, "value" + i);
            //发送消息给服务器
            kafkaProducer.send(record);
        }

        //关闭生产者
        kafkaProducer.close();

    }
}

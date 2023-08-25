package com.salescontrol.shopservice.services;

import com.salescontrol.shopservice.models.ItemEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ItemProducerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemProducerService.class);
    private NewTopic topic;
    KafkaTemplate<String, ItemEvent> kafkaTemplate;
    @Autowired
    public ItemProducerService(NewTopic topic, KafkaTemplate<String, ItemEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(ItemEvent event){
        LOGGER.info(String.format("New purchase => %s",event.toString()));
        Message<ItemEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC,topic.name())
                .build();
        kafkaTemplate.send(message);
    }
}


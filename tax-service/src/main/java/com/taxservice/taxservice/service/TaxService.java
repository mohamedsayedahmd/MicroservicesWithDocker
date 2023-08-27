package com.taxservice.taxservice.service;

import com.basedomain.basedomain.dto.ItemEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TaxService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaxService.class);

    @KafkaListener(
            topics = "items_topic",
            groupId = "tax_Id")
    public void consumer(ItemEvent event){
        LOGGER.info(String.format("Order event received in email service => %s", event.toString()));
    }
}

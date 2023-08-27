package com.taxservice.taxservice.service;

import com.basedomain.basedomain.dto.ItemEvent;
import com.taxservice.taxservice.repo.TaxRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaxService {
    private final TaxRepo taxRepo;
    private static final Logger LOGGER = LoggerFactory.getLogger(TaxService.class);

    @Autowired
    public TaxService(TaxRepo taxRepo) {
        this.taxRepo = taxRepo;
    }

    @KafkaListener(
            topics = "items_topic",
            groupId = "tax_Id")
    public void consumer(ItemEvent event){
        LOGGER.warn(String.format("Order event received in tax service => %s", event.toString()));

        // Assuming the taxRepo.save(event) method works correctly
        taxRepo.save(event);
    }
}

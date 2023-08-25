package com.salescontrol.shopservice.controllers;

import com.salescontrol.shopservice.models.ItemDetails;
import com.salescontrol.shopservice.models.ItemEvent;
import com.salescontrol.shopservice.services.ItemProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

    private ItemProducerService itemProducerService;
    @Autowired
    public ItemController(ItemProducerService itemProducerService) {
        this.itemProducerService = itemProducerService;
    }

    @PostMapping("/credit-card")
    public void buyItem(@RequestBody ItemDetails itemDetails){
        ItemDetails item = new ItemDetails(
                UUID.randomUUID().toString()
                , itemDetails.getName()
                , itemDetails.getQuantity()
                , itemDetails.getPrice());

        ItemEvent itemEvent = new ItemEvent(
                "Credit Card"
                , item
                , LocalDateTime.now());
        itemProducerService.sendMessage(itemEvent);
    }

}

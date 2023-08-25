package com.salescontrol.shopservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemEvent {
    private String paymentMethod;
    private ItemDetails itemDetails;
    private LocalDateTime eventDate; // New date field
}

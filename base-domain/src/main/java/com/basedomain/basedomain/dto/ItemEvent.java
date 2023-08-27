package com.basedomain.basedomain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemEvent {
    @Id
    private String itemEventId;
    @Field
    private String paymentMethod;
    @Field
    private ItemDetails itemDetails;
    @Field
    private LocalDateTime eventDate; // New date field
}

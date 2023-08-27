package com.basedomain.basedomain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDetails {
    private String itemId;
    private String name;
    private Integer quantity;
    private double price;
}

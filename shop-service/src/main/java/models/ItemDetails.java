package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDetails {
    private Integer itemId;
    private String name;
    private Integer quantity;
    private double price;
}

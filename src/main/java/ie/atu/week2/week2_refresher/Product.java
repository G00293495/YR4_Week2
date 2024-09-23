package ie.atu.week2.week2_refresher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    Long id;
    private String name;
    private double price;
}

package org.milycorp.bitelog.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Drink {
    private String name;
    private String description;
    private BigDecimal price;
    private DishType dishType;
}

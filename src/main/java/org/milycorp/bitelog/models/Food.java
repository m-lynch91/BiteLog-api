package org.milycorp.bitelog.models;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Builder
@Data
public class Food {
    private String name;
    private BigDecimal price;
    private CuisineType cuisineType;
    private MealTimeType mealTimeType;
    private DishType dishType;
    private AllergenType allergenType;

}

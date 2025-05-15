package org.milycorp.bitelog.services;

import org.milycorp.bitelog.models.Address;
import org.milycorp.bitelog.models.CuisineType;
import org.milycorp.bitelog.models.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public Restaurant getRestaurantById(UUID id) {
        return Restaurant.builder()
                .id(id)
                .phone("123-456-0000")
                .email("restuarant@gmail.com")
                .address(Address.builder()
                        .number(123)
                        .street("Ossington Avenue")
                        .city("Toronto")
                        .province("Ontario")
                        .postalCode("M6K0A0")
                        .country("Canada")
                        .build())
                .cuisine(Arrays.asList(CuisineType.BARBECUE))
                .websiteLink("https://www.google.com")
                .build();
    }
}

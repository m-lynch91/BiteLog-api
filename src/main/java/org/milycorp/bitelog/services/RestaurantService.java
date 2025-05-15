package org.milycorp.bitelog.services;

import org.milycorp.bitelog.models.Restaurant;

import java.util.UUID;

public interface RestaurantService {
    Restaurant getRestaurantById(UUID id);
}

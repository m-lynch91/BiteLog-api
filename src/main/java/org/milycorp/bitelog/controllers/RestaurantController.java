package org.milycorp.bitelog.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.milycorp.bitelog.models.Restaurant;
import org.milycorp.bitelog.services.RestaurantService;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class RestaurantController {
    private RestaurantService restaurantService;

    public Restaurant getRestaurantById(UUID id) {
      log.debug("getRestaurantById - in controller");

      return restaurantService.getRestaurantById(id);
    }
}

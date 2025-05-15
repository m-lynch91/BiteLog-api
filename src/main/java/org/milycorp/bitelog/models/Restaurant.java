package org.milycorp.bitelog.models;


import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Builder
@Data
public class Restaurant {
    private UUID id;
    private String name;
    private Address address;
    private String phone;
    private String email;
    private String websiteLink;
    private List<CuisineType> cuisine;
}

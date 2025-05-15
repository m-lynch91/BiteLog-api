package org.milycorp.bitelog.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String street;
    private Integer number;
    private String city;
    private String province;
    private String country;
    private String postalCode;
}

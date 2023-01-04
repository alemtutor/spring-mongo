package com.alem.springmongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    String streetName;
    String city;
    String zipCode;
    State state;
    Country country;



}

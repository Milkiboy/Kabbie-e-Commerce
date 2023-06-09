package com.kabbeeecommercebackend.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

}

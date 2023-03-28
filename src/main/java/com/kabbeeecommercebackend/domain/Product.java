package com.kabbeeecommercebackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "* product name is required")
    private String productName;

   @DecimalMin(value = "0.1")
   private double price;
    private String description;
    private boolean isPurchased;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User seller;

}

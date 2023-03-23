package com.kabbeeecommercebackend.domain;

import com.kabbeeecommercebackend.enums.OrderStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(style = "yyyy-mm-dd")
//    @NotNull
    private LocalDate orderDate;
    private OrderStatus orderStatus;
    private double totalOrderPrice;
//
    @ManyToOne
    private User buyer;


    @OneToOne
   private ShoppingCart shoppingCart;
}
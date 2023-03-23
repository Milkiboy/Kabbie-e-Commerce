package com.kabbeeecommercebackend.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kabbeeecommercebackend.domain.User;
import com.kabbeeecommercebackend.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    @JsonProperty("order_id")
    private long id;
    @JsonProperty("order_date")
    private LocalDate orderDate;
    @JsonProperty("order_status")
    private OrderStatus orderStatus;
    @JsonProperty("total_price")
    private double totalOrderPrice;
    @JsonProperty("buyer")
    private User buyer;
}

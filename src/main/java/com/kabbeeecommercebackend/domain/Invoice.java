package com.kabbeeecommercebackend.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Entity
    public class Invoice {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @NotNull(message = "* card number is required")
        @Size(min = 8)
        private String cardNumber;

        @ManyToOne
        private User user;

    }


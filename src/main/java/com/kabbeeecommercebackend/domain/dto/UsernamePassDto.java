package com.kabbeeecommercebackend.domain.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsernamePassDto {

        @Column(nullable=false)
    @NotNull(message = "* userName is required")
    private String username;

    @Column(nullable=false)
    @NotNull(message = "* password is required")
    private String password;
}

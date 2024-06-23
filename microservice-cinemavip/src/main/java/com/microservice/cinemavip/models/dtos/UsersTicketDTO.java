package com.microservice.cinemavip.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersTicketDTO {
    String firstName;

    String lastName;

    String email;
}

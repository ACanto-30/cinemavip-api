package com.microservice.cinemavip.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UsersDTO {

    @NotBlank(message = "El campo no debe estar vacío")
    String firstName;

    @NotBlank
    @Length(min = 2, max = 30, message = "Debe contener un minimo de 2 caracteres y un maximo de 30")
    String lastName;

    @Email(message = "El campo debe contener un Email válido")
    String email;

}

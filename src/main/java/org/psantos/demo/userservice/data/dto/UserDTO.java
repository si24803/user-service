package org.psantos.demo.userservice.data.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String name;
    private LocalDate lastLogin;
}

package com.ironhack.backAnimalCrossing.controller.DTO;

import lombok.Data;

import java.util.Set;
@Data
public class UserDTO {
    private String username;
    private String password;
    private Set<RoleDTO> roles;
}


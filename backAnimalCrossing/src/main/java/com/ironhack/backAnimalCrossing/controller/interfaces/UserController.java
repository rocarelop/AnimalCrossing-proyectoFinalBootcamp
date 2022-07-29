package com.ironhack.backAnimalCrossing.controller.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.UserDTO;
import com.ironhack.backAnimalCrossing.model.User;

import java.util.List;

public interface UserController {
    UserDTO register(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO login(User user);
}

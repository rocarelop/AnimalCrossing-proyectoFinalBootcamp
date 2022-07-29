package com.ironhack.backAnimalCrossing.service.interfaces;
import com.ironhack.backAnimalCrossing.controller.DTO.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO store(UserDTO user);
    List<UserDTO> findAll();
}

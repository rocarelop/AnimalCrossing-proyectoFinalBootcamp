package com.ironhack.backAnimalCrossing.service.impl;

import com.ironhack.backAnimalCrossing.Repository.UserRepository;
import com.ironhack.backAnimalCrossing.controller.DTO.RoleDTO;
import com.ironhack.backAnimalCrossing.controller.DTO.UserDTO;
import com.ironhack.backAnimalCrossing.model.Role;
import com.ironhack.backAnimalCrossing.model.User;
import com.ironhack.backAnimalCrossing.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDTO store(UserDTO userDTO) {
        User user = toModel(userDTO);
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));

        // Set default profile
        user.setRoles(Set.of(new Role(null, "USER", user)));
        User savedUser = userRepository.save(user);
        savedUser.setPassword(null);
        return toDTO(savedUser);
    }

    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> response = users.stream().map(this::toDTO).toList();

        return response;
    }

    private User toModel(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());

        return user;
    }

    private UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRoles(user.getRoles().stream().map(this::roleToDTO).collect(Collectors.toSet()));

        return userDTO;
    }

    private RoleDTO roleToDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName(role.getName());

        return roleDTO;
    }
}

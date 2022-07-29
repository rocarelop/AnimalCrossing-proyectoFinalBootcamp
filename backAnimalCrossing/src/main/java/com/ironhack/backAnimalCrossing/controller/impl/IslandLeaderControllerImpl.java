package com.ironhack.backAnimalCrossing.controller.impl;
import com.ironhack.backAnimalCrossing.controller.DTO.IslandLeaderDTO;
import com.ironhack.backAnimalCrossing.controller.interfaces.IslandLeaderController;
import com.ironhack.backAnimalCrossing.model.IslandLeader;
import com.ironhack.backAnimalCrossing.service.interfaces.IslandLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IslandLeaderControllerImpl implements IslandLeaderController {
    @Autowired
    private IslandLeaderService islandLeaderService;

    @GetMapping("/island-leaders")
    @ResponseStatus(HttpStatus.OK)
    public List<IslandLeader> getAllIslandLeaders() {
    return islandLeaderService.getAllIslandLeaders();
    }

    @GetMapping("/island-leaders/{id}")
    @ResponseStatus(HttpStatus.OK)
    public IslandLeader getIslandLeaderById(@PathVariable(name = "id") Long id) {
        return islandLeaderService.getIslandLeaderById(id);
    }

    @PostMapping("/island-leaders")
    @ResponseStatus(HttpStatus.CREATED)
    public IslandLeader createIslandLeader(@RequestBody IslandLeaderDTO islandLeaderDTO) {
        return islandLeaderService.createIslandLeader(islandLeaderDTO);
    }

    @DeleteMapping("/island-leaders/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteIslandLeader(@PathVariable(name="id") Long id) {
        islandLeaderService.deleteIslandLeader(id);
    }
}

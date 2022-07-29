package com.ironhack.backAnimalCrossing.controller.impl;

import com.ironhack.backAnimalCrossing.controller.DTO.IslandDTO;
import com.ironhack.backAnimalCrossing.controller.interfaces.IslandController;
import com.ironhack.backAnimalCrossing.model.Island;
import com.ironhack.backAnimalCrossing.service.interfaces.IslandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class IslandControllerImpl implements IslandController {
   @Autowired
   private IslandService islandService;

    @GetMapping("/islands")
    @ResponseStatus(HttpStatus.OK)
    public List<Island> getAllIslands() {
        return islandService.getAllIslands();
    }

    @GetMapping("/islands/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Island getIslandById(@PathVariable(name="id") Long id){
        return islandService.getIslandById(id);
    }

    @PostMapping("/islands")
    @ResponseStatus(HttpStatus.CREATED)
    public Island createIsland(@RequestBody IslandDTO islandDTO) {
        return islandService.createIsland(islandDTO);
    }

    @DeleteMapping("/islands/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteIsland(@PathVariable(name="id") Long id) {
        islandService.deleteIsland(id);
    }


}

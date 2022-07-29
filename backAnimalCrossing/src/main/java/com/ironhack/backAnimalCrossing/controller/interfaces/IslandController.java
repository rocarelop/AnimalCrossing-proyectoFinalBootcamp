package com.ironhack.backAnimalCrossing.controller.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.IslandDTO;
import com.ironhack.backAnimalCrossing.model.Island;

import java.util.List;

public interface IslandController {
    List<Island> getAllIslands();
    Island getIslandById(Long id);
    Island createIsland(IslandDTO islandDTO);
    void deleteIsland(Long id);
}


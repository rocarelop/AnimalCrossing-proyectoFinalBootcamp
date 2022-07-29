package com.ironhack.backAnimalCrossing.service.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.IslandDTO;
import com.ironhack.backAnimalCrossing.model.Island;

import java.util.List;

public interface IslandService {
    List<Island> getAllIslands();
    Island getIslandById(Long id);
    Island createIsland(IslandDTO islandDTO);
    void deleteIsland(Long id);

}


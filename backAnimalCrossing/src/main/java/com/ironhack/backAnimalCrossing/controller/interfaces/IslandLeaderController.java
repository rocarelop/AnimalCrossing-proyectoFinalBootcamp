package com.ironhack.backAnimalCrossing.controller.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.IslandLeaderDTO;
import com.ironhack.backAnimalCrossing.model.IslandLeader;

import java.util.List;

public interface IslandLeaderController {
    List<IslandLeader> getAllIslandLeaders();
    IslandLeader getIslandLeaderById(Long id);
    IslandLeader createIslandLeader(IslandLeaderDTO islandLeaderDTO);
    void deleteIslandLeader(Long id);
}

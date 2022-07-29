package com.ironhack.backAnimalCrossing.controller.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.FishCatchedDTO;
import com.ironhack.backAnimalCrossing.controller.DTO.IslandDTO;
import com.ironhack.backAnimalCrossing.model.FishCatched;
import com.ironhack.backAnimalCrossing.model.Island;

import java.util.List;

public interface FishCatchedController {
    List<FishCatched> getAllFishCatched();
    FishCatched getFishCatchedById(Long id);
    FishCatched createFishCatched(FishCatchedDTO fishCatchedDTO);
    void deleteFishCatched(Long id);

}

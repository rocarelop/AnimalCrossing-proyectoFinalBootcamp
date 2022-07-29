package com.ironhack.backAnimalCrossing.service.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.FishCatchedDTO;
import com.ironhack.backAnimalCrossing.model.FishCatched;

import java.util.List;

public interface FishCatchedService {
    List<FishCatched> getAllFishCatched();
    FishCatched getFishCatchedById(Long id);
    FishCatched createFishCatched(FishCatchedDTO fishCatchedDTO);
    void deleteFishCatched(Long id);
}

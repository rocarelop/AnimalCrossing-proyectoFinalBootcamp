package com.ironhack.backAnimalCrossing.service.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.BugCatchedDTO;
import com.ironhack.backAnimalCrossing.controller.DTO.FishCatchedDTO;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.FishCatched;

import java.util.List;

public interface BugCatchedService {
    List<BugCatched> getAllBugCatched();
    BugCatched getBugCatchedById(Long id);
    BugCatched createBugCatched(BugCatchedDTO bugCatchedDTO);
    void deleteBugCatched(Long id);

}

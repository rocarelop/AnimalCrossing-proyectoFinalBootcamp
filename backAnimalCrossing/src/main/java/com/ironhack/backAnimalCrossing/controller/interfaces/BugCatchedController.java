package com.ironhack.backAnimalCrossing.controller.interfaces;

import com.ironhack.backAnimalCrossing.controller.DTO.BugCatchedDTO;
import com.ironhack.backAnimalCrossing.model.BugCatched;

import java.util.List;

public interface BugCatchedController {
    List<BugCatched> getAllBugCatched();
    BugCatched getBugCatchedById(Long id);
    BugCatched createBugCatched(BugCatchedDTO bugCatchedDTO);
    void deleteBugCatched(Long id);
}


package com.ironhack.backAnimalCrossing.controller.impl;

import com.ironhack.backAnimalCrossing.controller.DTO.BugCatchedDTO;
import com.ironhack.backAnimalCrossing.controller.interfaces.BugCatchedController;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.service.interfaces.BugCatchedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BugCatchedControllerImpl implements BugCatchedController {

    @Autowired
    BugCatchedService bugCatchedService;

    @GetMapping("/bugcatcheds")
    @ResponseStatus(HttpStatus.OK)
    public List<BugCatched> getAllBugCatched() {
        return bugCatchedService.getAllBugCatched();
    }
    @GetMapping("/bugcatcheds/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BugCatched getBugCatchedById(@PathVariable(name="id") Long id) {
        return bugCatchedService.getBugCatchedById(id);
    }

    @PostMapping("/bugcatcheds")
    @ResponseStatus(HttpStatus.CREATED)
    public BugCatched createBugCatched(@RequestBody BugCatchedDTO bugCatchedDTO) {
        return bugCatchedService.createBugCatched(bugCatchedDTO);
    }

    @DeleteMapping("/bugcatcheds/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBugCatched(@PathVariable(name="id") Long id) {
        bugCatchedService.deleteBugCatched(id);
    }


}

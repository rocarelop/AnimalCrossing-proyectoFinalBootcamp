package com.ironhack.backAnimalCrossing.controller.impl;

import com.ironhack.backAnimalCrossing.controller.DTO.FishCatchedDTO;
import com.ironhack.backAnimalCrossing.controller.DTO.IslandDTO;
import com.ironhack.backAnimalCrossing.controller.interfaces.FishCatchedController;
import com.ironhack.backAnimalCrossing.model.FishCatched;
import com.ironhack.backAnimalCrossing.service.interfaces.FishCatchedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FishCatchedControllerImpl implements FishCatchedController {

    @Autowired
    private FishCatchedService fishCatchedService;

    @GetMapping("/fishcatcheds")
    @ResponseStatus(HttpStatus.OK)
    public List<FishCatched> getAllFishCatched() {
        return fishCatchedService.getAllFishCatched();
    }

    @GetMapping("/fishcatcheds/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FishCatched getFishCatchedById(@PathVariable(name="id") Long id) {
        return fishCatchedService.getFishCatchedById(id);
    }

    @PostMapping("/fishcatcheds")
    @ResponseStatus(HttpStatus.CREATED)
    public FishCatched createFishCatched(@RequestBody FishCatchedDTO fishCatchedDTO) {
        return fishCatchedService.createFishCatched(fishCatchedDTO);
    }

    @DeleteMapping("/fishcatcheds/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFishCatched(@PathVariable(name="id") Long id) {
        fishCatchedService.deleteFishCatched(id);
    }


}

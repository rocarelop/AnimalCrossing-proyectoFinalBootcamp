package com.ironhack.backAnimalCrossing.service.impl;

import com.ironhack.backAnimalCrossing.Repository.FishCatchedRepository;
import com.ironhack.backAnimalCrossing.controller.DTO.FishCatchedDTO;
import com.ironhack.backAnimalCrossing.model.FishCatched;
import com.ironhack.backAnimalCrossing.model.Island;
import com.ironhack.backAnimalCrossing.service.interfaces.FishCatchedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class FishCatchedServiceImpl implements FishCatchedService {
    @Autowired
    FishCatchedRepository fishCatchedRepository;

    public List<FishCatched> getAllFishCatched() {
        return fishCatchedRepository.findAll();
    }

    public FishCatched getFishCatchedById(Long id) {
        Optional<FishCatched> fishCatched = fishCatchedRepository.findById(id);

        if (fishCatched.isPresent()) {
            return fishCatched.get();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fish catched matching that Id");
        }
    }



    public FishCatched createFishCatched(FishCatchedDTO fishCatchedDTO) {
        FishCatched fishCatched= new FishCatched(fishCatchedDTO.getName(), fishCatchedDTO.getIslandLeader(), fishCatchedDTO.getFishes());
        return fishCatchedRepository.save(fishCatched);
    }


    public void deleteFishCatched(Long id) {
        Optional<FishCatched> fishCatched = fishCatchedRepository.findById(id);
        if (fishCatched.isPresent()) {
            fishCatchedRepository.deleteById(fishCatched.get().getId());

        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fish catched matching that Id");
        }

    }
}

package com.ironhack.backAnimalCrossing.service.impl;

import com.ironhack.backAnimalCrossing.Repository.IslandRepository;
import com.ironhack.backAnimalCrossing.controller.DTO.IslandDTO;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.FishCatched;
import com.ironhack.backAnimalCrossing.model.Island;
import com.ironhack.backAnimalCrossing.model.IslandLeader;
import com.ironhack.backAnimalCrossing.service.interfaces.IslandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class IslandServiceImpl implements IslandService {
    @Autowired
    IslandRepository islandRepository;

    public List<Island> getAllIslands() {
        return islandRepository.findAll();
    }

    public Island getIslandById(Long id) {
        Optional<Island> island = islandRepository.findById(id);

        if (island.isPresent()) {
            return island.get();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No island matching that Id");
        }
    }

    public Island createIsland(IslandDTO islandDTO) {
        Island island1= new Island(islandDTO.getName(), islandDTO.getIslandLeader(), islandDTO.getVillagers());
        return islandRepository.save(island1);
    }

    public void deleteIsland(Long id) {
        Optional<Island> island = islandRepository.findById(id);
        if (island.isPresent()) {
            islandRepository.deleteById(island.get().getId());

        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No island  matching that Id");
        }
    }
}

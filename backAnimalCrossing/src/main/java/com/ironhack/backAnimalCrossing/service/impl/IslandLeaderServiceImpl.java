package com.ironhack.backAnimalCrossing.service.impl;

import com.ironhack.backAnimalCrossing.Repository.BugCatchedRepository;
import com.ironhack.backAnimalCrossing.Repository.FishCatchedRepository;
import com.ironhack.backAnimalCrossing.Repository.IslandLeaderRepository;
import com.ironhack.backAnimalCrossing.Repository.IslandRepository;
import com.ironhack.backAnimalCrossing.controller.DTO.IslandLeaderDTO;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.FishCatched;
import com.ironhack.backAnimalCrossing.model.Island;
import com.ironhack.backAnimalCrossing.model.IslandLeader;
import com.ironhack.backAnimalCrossing.service.interfaces.IslandLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class IslandLeaderServiceImpl implements IslandLeaderService {
    @Autowired
    private IslandLeaderRepository islandLeaderRepository;

    @Autowired
    private IslandRepository islandRepository;

    @Autowired
    private FishCatchedRepository fishCatchedRepository;

    @Autowired
    private BugCatchedRepository bugCatchedRepository;

    public List<IslandLeader> getAllIslandLeaders() {
        return islandLeaderRepository.findAll();
    }

    public IslandLeader getIslandLeaderById(Long id) {
        Optional<IslandLeader> islandLeader = islandLeaderRepository.findById(id);

        if (islandLeader.isPresent()) {
            return islandLeader.get();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No island leader matching that Id");
        }

    }

    public IslandLeader createIslandLeader(IslandLeaderDTO islandLeaderDTO) {
        IslandLeader newIslandLeader = new IslandLeader(islandLeaderDTO.getName(), islandLeaderDTO.getHobby(), islandLeaderDTO.getPhoto());
        islandLeaderRepository.save(newIslandLeader);
        return newIslandLeader;
    }

    public void deleteIslandLeader(Long id) {

        Optional<IslandLeader> islandLeader = islandLeaderRepository.findById(id);
        if (islandLeader.isPresent()) {
            Optional<Island> island = islandRepository.findById(id);
            Optional<FishCatched> fishCatched = fishCatchedRepository.findById(id);
            Optional<BugCatched> bugCatched = bugCatchedRepository.findById(id);

            if (island.isPresent()) {
                islandRepository.deleteById(island.get().getId());
            }
            if (fishCatched.isPresent()) {
                fishCatchedRepository.deleteById(fishCatched.get().getId());
            }
            if (bugCatched.isPresent()) {
                bugCatchedRepository.deleteById(bugCatched.get().getId());
            }
            islandLeaderRepository.deleteById(islandLeader.get().getId());

        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No island leader matching that Id");
        }
    }
}

package com.ironhack.backAnimalCrossing.service.impl;

import com.ironhack.backAnimalCrossing.Repository.BugCatchedRepository;
import com.ironhack.backAnimalCrossing.controller.DTO.BugCatchedDTO;
import com.ironhack.backAnimalCrossing.model.BugCatched;
import com.ironhack.backAnimalCrossing.model.FishCatched;
import com.ironhack.backAnimalCrossing.service.interfaces.BugCatchedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class BugCatchedServiceImpl implements BugCatchedService {

    @Autowired
    BugCatchedRepository bugCatchedRepository;

    public List<BugCatched> getAllBugCatched() {
        return bugCatchedRepository.findAll();
    }


    public BugCatched getBugCatchedById(Long id) {
        Optional<BugCatched> bugCatched = bugCatchedRepository.findById(id);

        if (bugCatched.isPresent()) {
            return bugCatched.get();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No bug catched matching that Id");
        }
    }


    public BugCatched createBugCatched(BugCatchedDTO bugCatchedDTO) {
        BugCatched bugCatched= new BugCatched(bugCatchedDTO.getName(), bugCatchedDTO.getIslandLeader(), bugCatchedDTO.getBugs());
        return bugCatchedRepository.save(bugCatched);
    }


    public void deleteBugCatched(Long id) {
        Optional<BugCatched> bugCatched = bugCatchedRepository.findById(id);
        if (bugCatched.isPresent()) {
            bugCatchedRepository.deleteById(bugCatched.get().getId());

        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No bug catched matching that Id");
        }

    }
}

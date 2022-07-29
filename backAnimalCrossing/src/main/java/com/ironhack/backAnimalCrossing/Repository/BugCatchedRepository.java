package com.ironhack.backAnimalCrossing.Repository;

import com.ironhack.backAnimalCrossing.model.BugCatched;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugCatchedRepository extends JpaRepository<BugCatched, Long> {

}


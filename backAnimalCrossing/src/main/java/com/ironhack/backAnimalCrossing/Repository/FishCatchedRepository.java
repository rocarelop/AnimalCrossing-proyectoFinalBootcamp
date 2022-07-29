package com.ironhack.backAnimalCrossing.Repository;

import com.ironhack.backAnimalCrossing.model.FishCatched;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishCatchedRepository extends JpaRepository<FishCatched, Long> {

}


package com.ironhack.backAnimalCrossing.Repository;

import com.ironhack.backAnimalCrossing.model.Island;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IslandRepository extends JpaRepository<Island, Long> {

}


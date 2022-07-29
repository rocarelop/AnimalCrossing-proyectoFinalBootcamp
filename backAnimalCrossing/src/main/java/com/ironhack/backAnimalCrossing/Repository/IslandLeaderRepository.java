package com.ironhack.backAnimalCrossing.Repository;

import com.ironhack.backAnimalCrossing.model.IslandLeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IslandLeaderRepository extends JpaRepository<IslandLeader, Long> {

}


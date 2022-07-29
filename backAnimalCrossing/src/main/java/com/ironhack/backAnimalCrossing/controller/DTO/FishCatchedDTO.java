package com.ironhack.backAnimalCrossing.controller.DTO;

import com.ironhack.backAnimalCrossing.model.IslandLeader;

public class FishCatchedDTO {


    private String name;

    private IslandLeader islandLeader;

    private String[] fishes;

    public FishCatchedDTO() {
    }

    public FishCatchedDTO(String name, IslandLeader islandLeader, String[] fishes) {
        this.name = name;
        this.islandLeader = islandLeader;
        this.fishes = fishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IslandLeader getIslandLeader() {
        return islandLeader;
    }

    public void setIslandLeader(IslandLeader islandLeader) {
        this.islandLeader = islandLeader;
    }

    public String[] getFishes() {
        return fishes;
    }

    public void setFishes(String[] fishes) {
        this.fishes = fishes;
    }
}

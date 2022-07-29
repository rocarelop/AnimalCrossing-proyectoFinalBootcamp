package com.ironhack.backAnimalCrossing.controller.DTO;

import com.ironhack.backAnimalCrossing.model.IslandLeader;

public class IslandDTO {
    private String name;

    private IslandLeader islandLeader;
    private String[] villagers;

    public IslandDTO() {
    }

    public IslandDTO(String name, IslandLeader islandLeader, String[] villagers) {
        this.name = name;
        this.islandLeader = islandLeader;
        this.villagers = villagers;
    }

    public IslandLeader getIslandLeader() {
        return islandLeader;
    }

    public void setIslandLeader(IslandLeader islandLeader) {
        this.islandLeader = islandLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String[] getVillagers() {
        return villagers;
    }

    public void setVillagers(String[] villagers) {
        this.villagers = villagers;
    }
}

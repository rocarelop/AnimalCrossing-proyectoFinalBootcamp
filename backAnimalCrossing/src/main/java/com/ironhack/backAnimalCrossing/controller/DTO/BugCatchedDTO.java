package com.ironhack.backAnimalCrossing.controller.DTO;

import com.ironhack.backAnimalCrossing.model.IslandLeader;

public class BugCatchedDTO {

    private String name;

    private IslandLeader islandLeader;
    private String[] bugs;

    public BugCatchedDTO() {
    }

    public BugCatchedDTO(String name, IslandLeader islandLeader, String[] bugs) {
        this.name = name;
        this.islandLeader = islandLeader;
        this.bugs = bugs;
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

    public String[] getBugs() {
        return bugs;
    }

    public void setBugs(String[] bugs) {
        this.bugs = bugs;
    }
}

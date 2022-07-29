package com.ironhack.backAnimalCrossing.model;

import javax.persistence.*;

@Entity
public class BugCatched {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "islandLeader_Bid")
    private IslandLeader islandLeader;

    private String[] bugs;

    public BugCatched() {
    }

    public BugCatched(String name, IslandLeader islandLeader, String[] bugs) {
        this.name = name;
        this.islandLeader = islandLeader;
        this.bugs = bugs;
    }

    public BugCatched(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String[] getBugs() {
        return bugs;
    }

    public void setBugs(String[] bugs) {
        this.bugs = bugs;
    }
}

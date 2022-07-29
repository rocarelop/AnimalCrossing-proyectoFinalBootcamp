package com.ironhack.backAnimalCrossing.model;

import javax.persistence.*;

@Entity
public class Island {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "islandLeader_id")
    private IslandLeader islandLeader;


    private String[] villagers;

    public Island() {
    }

    public Island(String name, IslandLeader islandLeader, String[] villagers) {
        this.name = name;
        this.islandLeader = islandLeader;
        this.villagers = villagers;
    }

    public Island(String name) {
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

    public String[] getVillagers() {
        return villagers;
    }

    public void setVillagers(String[] villagers) {
        this.villagers = villagers;
    }
}

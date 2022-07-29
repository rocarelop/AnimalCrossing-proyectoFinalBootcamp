package com.ironhack.backAnimalCrossing.model;

import javax.persistence.*;

@Entity
public class FishCatched {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "islandLeader_id")
    private IslandLeader islandLeader;

    private String[] fishes;

    public FishCatched() {
    }

    public FishCatched(String name, IslandLeader islandLeader, String[] fishes) {
        this.name = name;
        this.islandLeader = islandLeader;
        this.fishes = fishes;
    }

    public FishCatched(String name) {
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



    public String[] getFishes() {
        return fishes;
    }

    public void setFishes(String[] fishes) {
        this.fishes = fishes;
    }

    public IslandLeader getIslandLeader() {
        return islandLeader;
    }

    public void setIslandLeader(IslandLeader islandLeader) {
        this.islandLeader = islandLeader;
    }
}

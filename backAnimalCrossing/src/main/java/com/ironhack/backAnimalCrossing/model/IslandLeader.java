package com.ironhack.backAnimalCrossing.model;

import javax.persistence.*;

@Entity
public class IslandLeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String hobby;

    private String photo;

    @OneToOne(mappedBy = "islandLeader")
    private Island island;

    @OneToOne(mappedBy = "islandLeader")
    private FishCatched fishCatched;

    @OneToOne(mappedBy = "islandLeader")
    private BugCatched bugCatched;


    public IslandLeader() {
    }

    public IslandLeader(String name, String hobby, String photo) {
        this.name = name;
        this.hobby = hobby;
        this.photo = photo;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

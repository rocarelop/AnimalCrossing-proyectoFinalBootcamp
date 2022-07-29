package com.ironhack.backAnimalCrossing.controller.DTO;

public class IslandLeaderDTO {

    private String name;

    private String hobby;

    private String photo;

    public IslandLeaderDTO() {
    }


    public IslandLeaderDTO(String name, String hobby, String photo) {
        this.name = name;
        this.hobby = hobby;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


}

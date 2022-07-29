package com.ironhack.backAnimalCrossing.controller.DTO;

public class FishDTO {

    private String fishName;

    public FishDTO() {
    }

    public FishDTO(String fishName) {
        this.fishName = fishName;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }
}

package com.ironhack.backAnimalCrossing.controller.DTO;

public class VillagersDTO {

    private String villagerName;

    public VillagersDTO() {
    }

    public VillagersDTO(String villagerName) {
        this.villagerName = villagerName;
    }

    public String getVillagerName() {
        return villagerName;
    }

    public void setVillagerName(String villagerName) {
        this.villagerName = villagerName;
    }
}

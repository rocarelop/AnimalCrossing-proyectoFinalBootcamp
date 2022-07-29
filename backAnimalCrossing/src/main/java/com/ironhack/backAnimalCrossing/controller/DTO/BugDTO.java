package com.ironhack.backAnimalCrossing.controller.DTO;

public class BugDTO {
    private String bugName;

    public BugDTO() {
    }

    public BugDTO(String bugName) {
        this.bugName = bugName;
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }
}

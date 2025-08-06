package com.HackWizards.WasteManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "FARM")
public class Farm {
    private String uselocation;
    private String areaOfLand;
    private int WeightOfWaste;
    @Id
    private String comment;
    private String location;

    public String getUselocation() {
        return uselocation;
    }

    public void setUselocation(String uselocation) {
        this.uselocation = uselocation;
    }

    public String getAreaOfLand() {
        return areaOfLand;
    }

    public void setAreaOfLand(String areaOfLand) {
        this.areaOfLand = areaOfLand;
    }

    public int getWeightOfWaste() {
        return WeightOfWaste;
    }

    public void setWeightOfWaste(int weightOfWaste) {
        WeightOfWaste = weightOfWaste;
    }

    public String  getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Farm(){

    }

    public Farm(String uselocation, String areaOfLand, int weightOfWaste, String  comment, String location) {
        this.uselocation = uselocation;
        this.areaOfLand = areaOfLand;
        WeightOfWaste = weightOfWaste;
        this.comment = comment;
        this.location = location;


    }
}

package com.HackWizards.WasteManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "RECYCLE")
public class Recycle
{
    private String ImageName;
    private String ImageType;
    @Lob
    private byte[] ImageData;

    private String TypeOfWaste;
    @Id
    private String comment;
    private String location;

    public Recycle(String imageName, String imageType, byte[] imageData, String typeOfWaste, String comment, String location) {
        ImageName = imageName;
        ImageType = imageType;
        ImageData = imageData;
        TypeOfWaste = typeOfWaste;
        this.comment = comment;
        this.location = location;
    }

    public Recycle()
    {

    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getImageType() {
        return ImageType;
    }

    public void setImageType(String imageType) {
        ImageType = imageType;
    }

    public byte[] getImageData() {
        return ImageData;
    }

    public void setImageData(byte[] imageData) {
        ImageData = imageData;
    }

    public String getTypeOfWaste() {
        return TypeOfWaste;
    }

    public void setTypeOfWaste(String typeOfWaste) {
        TypeOfWaste = typeOfWaste;
    }

    public String getComment() {
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
}

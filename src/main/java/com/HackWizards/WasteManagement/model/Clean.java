package com.HackWizards.WasteManagement.model;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CLEAN")
public class Clean
{

    private String ImageName;
    private String ImageType;
    @Lob
    private byte[] ImageData;

    private String name;
    @Id
    private String comment;
    private String location;

    public Clean()
    {

    }

    public Clean(String imageName, String imageType, byte[] imageData, String name, String comment, String location) {
        ImageName = imageName;
        ImageType = imageType;
        ImageData = imageData;
        this.name = name;
        this.comment = comment;
        this.location = location;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

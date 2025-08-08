package com.HackWizards.WasteManagement.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "RAGISTER")
public class Ragister
{

    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    @Id
    private String email;
    @Column(name = "MOBILE")
    private int mobile;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "PINCODE")
    private int pincode;
    @Column(name = "PASSWORD")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Ragister()
    {

    }

    public Ragister(String name, String email, int mobile, String location, int pincode, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.location=location;
        this.pincode = pincode;
        this.password = password;


    }
}

package com.begers.kentsimgeleri;

import java.io.Serializable;

public class Landmark implements Serializable {

    private String name;

    private  String country;

    private int image;

    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

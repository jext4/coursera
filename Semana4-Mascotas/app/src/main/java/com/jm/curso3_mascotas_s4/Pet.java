package com.jm.curso3_mascotas_s4;

public class Pet {

    private int picture;
    private String name;
    private int rate;

    public Pet(int picture, String name) {
        this.picture = picture;
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

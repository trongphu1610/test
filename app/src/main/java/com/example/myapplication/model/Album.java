package com.example.myapplication.model;

public class Album {
    private String avt, name;

    public Album() {
    }

    public Album(String avt, String name) {
        this.avt = avt;
        this.name = name;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "avt='" + avt + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

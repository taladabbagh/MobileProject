package com.example.mobileproject;

import java.io.File;

public class Watch {

    private int id;
    private String name;
    private double price;
    private String brand;
    private String model;
    private String gender;
    private File image;

    public Watch(int id, String name, double price, String brand, String model, String gender, File image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.gender = gender;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }
}
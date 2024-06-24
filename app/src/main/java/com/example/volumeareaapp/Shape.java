package com.example.volumeareaapp;

public class Shape {

    int imageRes;
    String shapeName;

    public Shape(String shapeName,int imageRes) {
        this.imageRes = imageRes;
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}

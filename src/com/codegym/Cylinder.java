package com.codegym;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
     public double getVolume(){
        return getArea()*height;
     }

    @Override
    public String toString() {
        return "A Cylinder has height = "
                + height
                +", which is a sub class of "
                +super.toString()
                + " and has Volume = "
                +getVolume();
    }
}

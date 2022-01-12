package com.codegym;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0,"red", 3.0);
        System.out.println(cylinder);
    }
}

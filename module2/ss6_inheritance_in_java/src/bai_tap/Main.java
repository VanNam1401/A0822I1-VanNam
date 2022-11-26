package bai_tap;

import bai_tap.circle.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "blue", 5);
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}

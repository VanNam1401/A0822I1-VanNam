package bai_tap;

public class CirCle {
    private double radius;
    private String color;
    public CirCle(){}

    public CirCle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter() {
        return Math.PI * 2 * this.getRadius();
    }

    @Override
    public String toString() {
        return "CirCle { " +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                '}';
    }
}

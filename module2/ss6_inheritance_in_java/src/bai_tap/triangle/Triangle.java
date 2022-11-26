package bai_tap.triangle;

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean checkTriangle() {
        if ((this.side1 + this.side2) > this.side3 && (this.side2 + this.side3) > this.side1 && (this.side3 + this.side1) > this.side2) {
            return true;
        }
        return false;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double area = 0;
        if (checkTriangle()) {
            double halfPerimeter = this.getPerimeter() / 2;
            area = Math.sqrt(halfPerimeter * (halfPerimeter - this.side1) * (halfPerimeter - this.side2) * (halfPerimeter - this.side3));
        }
        return area;
    }

    @Override
    public String toString() {
        return "Triangle is color: " + this.getColor() + ", area = " + this.getArea() + " and perimeter = " + this.getPerimeter();
    }
}

package bai_tap.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(7, "yellow", true);
        shapes[2] = new Rectangle(6, 8, "brown", true);
        for (Shape s : shapes) {
            System.out.println(s.getArea());
            if (s instanceof Square) {
                ((Square) s).howToColor();
            }
        }
    }
}

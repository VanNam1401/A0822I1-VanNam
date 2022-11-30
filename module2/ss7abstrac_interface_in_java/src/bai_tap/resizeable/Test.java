package bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "yellow", false);
        shapes[1] = new Rectangle(3, 5, "infinity", true);
        shapes[2] = new Square(6, "melinda", true);
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
        for (Shape s : shapes) {
            s.resize(Math.random() * 100);
        }
        System.out.println();
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
    }
}

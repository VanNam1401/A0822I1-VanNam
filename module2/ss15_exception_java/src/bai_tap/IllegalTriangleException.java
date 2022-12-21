package bai_tap;

public class IllegalTriangleException extends Exception {
    private int a;
    private int b;
    private int c;

    public IllegalTriangleException() {

    }
    public String getMessage() {
        return "Không phải 3 cạnh của tam giác";
    }
}

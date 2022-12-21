package demo;
// exception do người dùng tự định nghĩa
public class AgeExeption extends Exception {
    public AgeExeption() {
    }
    public AgeExeption(String message) {
        super(message);
    }
}

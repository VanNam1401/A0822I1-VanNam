package thuc_hanh;

public class DemoMethod {
    public static void main(String[] args) {
        DemoMethod demoMethod = new DemoMethod();
        int s = demoMethod.sum3(10, 20);
        int s2 = demoMethod.sum3(10, 20, 40);
        System.out.println("Ket qua la: " + s);
    }

    static void displayMessage(String mess) {
        System.out.println(mess);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum2(int a, int b) {
        return a + b;
    }
    int sum3(int a, int b) {
        return a + b;
    }
    int sum3(int a, int b, int c) {
        return a + b + c;
    }

}

package bai_tap;

public class SoNguyenToNhoHon100 {
    static boolean isPrimeNumber(int n) {
        for (int i = 2; i <Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return n > 2;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int count = 0;
        int N = 2;
        while (N < 100) {
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
            }
            N++;
        }
    }
}

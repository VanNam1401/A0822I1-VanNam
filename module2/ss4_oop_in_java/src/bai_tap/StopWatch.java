package bai_tap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
    }

    public double getEndTime() {
        return endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
//        return this.stop() - this.start();
        return endTime - startTime;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = {64, 25, 12, 22, 11};
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(arr));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.sort(arr);
        stopWatch.stop();
        System.out.println("Time: " + stopWatch.getElapsedTime());
//        stopWatch.printArray(arr);
    }

    public void sort(int[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

//    public void printArray(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
}


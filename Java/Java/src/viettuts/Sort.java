package viettuts;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 12, 4, 3, 254, 432, 1232, 444};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
//            for(int j = i+1 ; j < arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
        }
    }

    public static void selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        //int[] arr = {1, 12, 4, 3, 254, 432, 1232, 444};
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                System.out.println("pos = " + pos + " x = " + x + "  arr[pos] = " + arr[pos]);
                display(arr);
                System.out.println();
                arr[pos] = arr[pos - 1];
                pos--;
                display(arr);
                System.out.println();
            }
            System.out.println("pos = "+pos);
            arr[pos] = x;
            display(arr);
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}


package viettuts;

public class Search {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        for(int i = 1 ; i <= 20 ; i++){
            if(i % 2 == 0 ){
                arr[count++] = i;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println();

        System.out.println(binarySearch(arr,18));

    }

    public static int binarySearch(int[] arr, int num){
        int low = 0;
        int hight = arr.length - 1;
        while(hight >= low){
            int mid = (hight + low) /2;
            if(arr[mid] > num){
                hight = mid -1;
            }else if(arr[mid] == num){
                return mid;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
}

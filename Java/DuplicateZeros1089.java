import java.util.Arrays;

public class DuplicateZeros1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {

        int zeros = 0;
        int n = arr.length;

        for(int val: arr){
            if(val == 0)
                zeros++;
        }

        int start = n - 1; // 8-1 = 7
        int end = n + zeros - 1; // 8+2-1 = 9

        while (start < end){

            if(end < n){
                arr[end] = arr[start];
            }

            if(arr[start] == 0){
                end--;
                if(end < n){
                    arr[end] = 0;
                }
            }

            start--;
            end--;
        }

    }
}

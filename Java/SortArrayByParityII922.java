import java.util.Arrays;

public class SortArrayByParityII922 {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] result = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortArrayByParityII(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int evenPointer = 0;
        int oddPointer = 1;

       for (int num: nums){
           if(num % 2 == 0){
               result[evenPointer] = num;
               evenPointer += 2;
           }else {
               result[oddPointer] = num;
               oddPointer += 2;
           }
       }

        return result;
    }
}

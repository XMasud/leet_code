import java.util.Arrays;

public class SquaresofSortedArray977 {

    public static int[] sortArray(int[] arrays){

        for(int i =0; i< arrays.length; i++){
            for (int j=i+1; j< arrays.length; j++){
                int temp = 0;

                if(arrays[i] > arrays[j]){
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }
    public static int[] sortedSquares(int[] nums) {

        for(int i =0; i< nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}

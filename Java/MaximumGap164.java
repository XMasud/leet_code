import java.util.Arrays;

public class MaximumGap164 {
    public static int maximumGap(int[] nums) {
        int diff = 0;

        if(nums.length < 2)
            return diff;

        Arrays.sort(nums);
        for (int i=0; i< nums.length -1; i++){
            int temp = nums[i+1] - nums[i];
            if(temp > diff)
                diff = temp;
        }

        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,9,1};

        int result = maximumGap(arr);
        System.out.println(result);
    }
}

import java.util.HashMap;

public class MostFrequentNumberFollowingArray2190 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,3};
        int result = mostFrequent(nums,2);
        System.out.println(result);
    }
    public static int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];
        int num = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == key){
                count[nums[i + 1]]++;

                if(maxCount < count[nums[i + 1]]){
                    maxCount = count[nums[i + 1]];
                    num = nums[i + 1];
                }
            }
        }

        return num;
    }
}

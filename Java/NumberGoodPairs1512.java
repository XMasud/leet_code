public class NumberGoodPairs1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
    public static int numIdenticalPairs(int[] nums) {

        int pair = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    pair++;
            }
        }

        return pair;
    }
}

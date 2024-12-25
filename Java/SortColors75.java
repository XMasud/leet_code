public class SortColors75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0}; //0 0 1 1 2 2
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int min = nums[i];

            for (int j = i+1; j < nums.length; j++) {

                if(min > Math.min(min,nums[j])){
                    min = Math.min(min,nums[j]);
                    int temp = nums[i];
                    nums[i] = min;
                    nums[j] = temp;
                }
            }
        }
    }
}


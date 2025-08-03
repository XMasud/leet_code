public class FirstMissingPositive41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int result = firstMissingPositive(nums);
        System.out.println(result);
    }

    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] map = new boolean[n+1];

        for (int num: nums){
            if((num > 0) && (num <= n)){
                map[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if(!map[i])
                return i;
        }

        return n+1;
    }
}

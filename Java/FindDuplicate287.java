public class FindDuplicate287 {
    public static int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] num = {3,3,3,3,3};
        int result = findDuplicate(num);
        System.out.println(result);
    }
}

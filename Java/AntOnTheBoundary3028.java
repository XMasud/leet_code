public class AntOnTheBoundary3028 {
    public static void main(String[] args) {
        int[] nums = {3,2,-3,-4};
        int result = returnToBoundaryCount(nums);
        System.out.println(result);
    }
    public static int returnToBoundaryCount(int[] nums) {
        int count = 0, sum = 0;

        for (int num: nums){
            sum += num;

            if(sum == 0)
                count++;
        }

        return count;
    }
}

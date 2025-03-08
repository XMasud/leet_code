public class FindMinimumRotatedSortedArray153 {
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        int result = findMin(nums);
        System.out.println(result);
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}

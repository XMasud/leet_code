public class BinarySearch {

    static int search(int[] nums, int target){

        int low = 0;
        int high = nums.length -1;

        while (low <= high){
            int mid = (low+high)/2;
            if(target == nums[mid]){
                return mid;
            } else if (target > nums[mid]) {
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 12;

        int result = search(arr, target);
        System.out.println(result);
    }
}

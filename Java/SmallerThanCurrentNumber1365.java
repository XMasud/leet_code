public class SmallerThanCurrentNumber1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);

        for (Integer res: result){
            System.out.println(res);
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        if (nums.length < 2)
            return result;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}

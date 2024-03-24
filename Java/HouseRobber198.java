public class HouseRobber198 {

    public static int rob(int[] nums) {
        int rob = 0,i = 1;

        while(i< nums.length){

            if(nums[i] > nums[i-1]){
                rob = rob + nums[i];
            }else {
                rob = rob + nums[i-1];
            }

            i = i+2;
        }

        return rob;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int res = rob(nums);
        System.out.println(res);
    }
}

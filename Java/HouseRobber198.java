public class HouseRobber198 {

    public static int rob(int[] nums) {
        int evenBlockRob = 0,oddBlockRob = 0, i =0;

        while(i< nums.length){
           if( (i%2) == 0){
               evenBlockRob = evenBlockRob + nums[i];
           }else{
               oddBlockRob = oddBlockRob + nums[i];
           }
           i++;
        }
        return Math.max(evenBlockRob, oddBlockRob);
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        int res = rob(nums);
        System.out.println(res);
    }
}

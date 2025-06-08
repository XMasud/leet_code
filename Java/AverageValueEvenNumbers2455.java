public class AverageValueEvenNumbers2455 {
    public static void main(String[] args) {
        int[] nums = {9,3,8,4,2,5,3,8,6,1};
        int res = averageValue(nums);
        System.out.println(res);
    }
    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int num: nums){
            if((num % 2 == 0) && (num % 3 == 0)){
                sum += num;
                count++;
            }
        }

        return sum / count;
    }
}

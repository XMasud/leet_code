public class FindNumbersEvenNumberDigits1295 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int val: nums){
            int str_length = String.valueOf(val).length();
            if(str_length % 2 == 0)
                count++;
        }

        return count;
    }
}

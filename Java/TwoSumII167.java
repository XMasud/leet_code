import java.util.Arrays;

public class TwoSumII167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] res = twoSum(numbers,9);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0, right = numbers.length -1;

        while (left < right){
            if(numbers[left] + numbers[right] == target){
                res[0] = left+1;
                res[1] = right+1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }
        }
        return res;
    }
}

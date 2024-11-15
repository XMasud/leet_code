import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> list = new HashSet<>();

        for (int n: nums){
            list.add(n);
        }

        for (int i = 0; i <= nums.length; i++) {
            if(!list.contains(i)){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] num = {0,1};
        int result = missingNumber(num);
        System.out.println(result);
    }
}

import java.util.HashMap;
import java.util.Map;

public class SumUniqueElements1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int result = sumOfUnique(nums);
        System.out.println(result);
    }
    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        HashMap<Integer,Integer> result = new HashMap<>();

        for (int n: nums){
            result.put(n, result.getOrDefault(n,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : result.entrySet()){
            if(entry.getValue() == 1)
                sum = sum + entry.getKey();
        }

        return sum;
    }
}

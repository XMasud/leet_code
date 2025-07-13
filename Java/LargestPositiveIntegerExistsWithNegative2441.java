import java.util.HashSet;

public class LargestPositiveIntegerExistsWithNegative2441 {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        int result = findMaxK(nums);
        System.out.println(result);
    }
    public static int findMaxK(int[] nums) {
        int res = -1;
        HashSet<Integer> map = new HashSet<>();

        for (int n: nums){
            if(map.contains(n*-1))
                res = Math.max((n > 0) ? n : n *-1, res);
            map.add(n);
        }

        return res;
    }
}

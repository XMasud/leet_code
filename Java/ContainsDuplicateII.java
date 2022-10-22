
import java.util.HashMap;

public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i]))<= k){
                System.out.println(map.get(nums[i]));
                return true;
            }else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] number_list = {1,0,1,1};
        int k = 1;

        boolean result = containsNearbyDuplicate(number_list, k);

        System.out.println(result);
    }
}

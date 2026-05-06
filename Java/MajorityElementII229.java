import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII229 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> result = majorityElement(nums);
        System.out.println(result);
    }
    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> elements = new ArrayList<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int n = nums.length;

        for (int num: nums){
            frequency.put(num, frequency.getOrDefault(num,0 )+1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(value > (n/3)){
                elements.add(key);
            }
        }

        return elements;
    }
}

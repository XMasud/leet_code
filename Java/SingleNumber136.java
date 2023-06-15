import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> num_frequency = new HashMap<>();

        for (int i=0; i< nums.length; i++){

            if(!num_frequency.containsKey(nums[i])){
                num_frequency.put(nums[i],1);
            }else {
                num_frequency.put(nums[i],num_frequency.get(nums[i])+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : num_frequency.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value == 1){
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    public static int majorityElement(int[] nums) {
        int result = -1;
        HashMap<Integer, Integer>  elements = new HashMap<>();

        for(int i: nums ){
            if(elements.containsKey(i)){
                int count = elements.get(i);
                elements.put(i, count+1);
            }else{
                elements.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : elements.entrySet()){
            if(entry.getValue() > (nums.length)/2){
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums ={2,2,1,1,1,2,2};

        int result = majorityElement(nums);

        System.out.println(result);
    }
}

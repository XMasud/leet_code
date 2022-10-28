import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 0};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i< nums.length; i++){

            if(map.containsKey(nums[i]) && (i-map.get(nums[i]))<2){

            }else{
                map.put(nums[i], i);
            }

        }

        System.out.println(0+5/2);
    }
}

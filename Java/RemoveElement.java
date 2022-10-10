

public class RemoveElement {

    public int removeElement(int[] nums, int target){

        int count = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] != target) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        RemoveElement obj = new RemoveElement();
        int[] numbers = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = obj.removeElement(numbers, val);
    }
}

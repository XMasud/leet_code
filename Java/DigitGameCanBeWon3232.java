public class DigitGameCanBeWon3232 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,10};
        boolean result = canAliceWin(nums);
        System.out.println(result);
    }
    public static boolean canAliceWin(int[] nums) {

        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num: nums){
            int length = String.valueOf(num).length();
            if(length == 1){
                singleDigitSum += num;
            }else
                doubleDigitSum += num;
        }

        if(singleDigitSum == doubleDigitSum)
            return false;

        return true;
    }
}

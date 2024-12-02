public class UglyNumber263 {
    public static void main(String[] args) {
        boolean status = isUgly(8);
        System.out.println(status);
    }

    private static boolean isUgly(int i) {

        if (i <= 0 )
            return false;

        int[] nums = {2,3,5};
        for (int num:nums){
            while (i % num == 0){
                i /= num;
            }
        }

        return i == 1;
    }
}

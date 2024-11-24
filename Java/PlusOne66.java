public class PlusOne66 {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        for (Integer n: result){
            System.out.println(n);
        }
    }

    private static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
           if(digits[i] < 9){
               digits[i]++;
               return digits;
           }
           digits[i] = 0;
        }

        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;

        return newDigits;
    }
}

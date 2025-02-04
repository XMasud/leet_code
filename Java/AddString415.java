public class AddString415 {
    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";
        String result = addStrings(num1,num2);
        System.out.println(result);
    }

    private static String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0){
            int d1 = (i>= 0) ? num1.charAt(i) - '0': 0;
            int d2 = (j>= 0) ? num2.charAt(j) - '0': 0;

            int sum = d1 + d2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
        return result.reverse().toString();
    }
}

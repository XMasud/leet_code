public class MultiplyStrings43 {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String result = multiply(num1,num2);
        System.out.println(result);
    }

    private static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n1 = num1.length();
        int n2 = num2.length();

        int[] product = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0 ; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0 ; j--) {
                int d2 = num2.charAt(j) - '0';

                int multiply = d1 * d2 + product[i + j + 1];

                product[i + j + 1] = multiply % 10;
                product[i + j] += multiply / 10;
            }
        }
        StringBuilder result = new StringBuilder();

        for (int num : product) {
            if (!(result.isEmpty() && num == 0)) {
                result.append(num);
            }
        }

        return result.toString();
    }
}

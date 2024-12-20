public class AddBinary67 {

    public static String addBinary(String a, String b) {

        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int carry = 0, base = 2;

        StringBuilder result = new StringBuilder();

        while (lengthA >= 0 || lengthB >= 0){
            int t1 = 0, t2 = 0, sum = 0;

            if(lengthA >= 0)
                t1 = a.charAt(lengthA--) - '0';

            if(lengthB >= 0)
                t2 = b.charAt(lengthB--) - '0';

            sum = t1 + t2 + carry;

            if(sum >= base){
                carry = 1;
                sum = sum - base;
            }else{
                carry = 0;
            }
            result.append(sum);
        }
        if(carry == 1)
            result.append(carry);

        return result.reverse().toString();
    }
    public static void main(String[] args) {

        String a = "11";
        String b = "1";
        String result = addBinary(a,b);
        System.out.println(result);
    }
}

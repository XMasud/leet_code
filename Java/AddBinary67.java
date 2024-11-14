public class AddBinary67 {

    public static String addBinary(String a, String b) {

        int sum = Integer.parseInt(a,2) + Integer.parseInt(b,2);

        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {

        String a = "11";
        String b = "1";
        String result = addBinary(a,b);
        System.out.println(result);
    }
}

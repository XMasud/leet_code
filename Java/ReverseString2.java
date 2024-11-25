public class ReverseString2 {
    public static String reverseStr(String s, int k) {
        String newString = "";

        for (int i = k-1; i >= 0 ; i--) {
            newString += s.charAt(i);
        }


        return newString+s.substring(k, s.length());
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        String res = reverseStr(s,2);
        System.out.println(res);
    }
}

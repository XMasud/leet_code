public class RepeatedSubstringPattern459 {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        boolean result = repeatedSubstringPattern(s);
        System.out.println(result);
    }

    private static boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int i = 0; i < s.length(); i++) {
            String newStr = "";
            if(i == 0){
                 newStr = String.valueOf(s.charAt(i));
            }else{
                 newStr = s.substring(0,i);
            }
            int multiplier = n / newStr.length();

            String result = multiplierString(newStr,multiplier);
            if(result.equals(s)){
                return true;
            }
        }
        return false;
    }

    public static String multiplierString(String s, int multiplier){
        StringBuilder newStr = new StringBuilder();
        int i = 0;
        while(i < multiplier){
            newStr.append(s);
            i++;
        }
        return newStr.toString();
    }
}

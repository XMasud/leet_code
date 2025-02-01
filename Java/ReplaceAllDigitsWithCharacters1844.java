public class ReplaceAllDigitsWithCharacters1844 {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        String result = replaceDigits(s);
        System.out.println(result);
    }

    private static String replaceDigits(String s) {

        if(s.isEmpty())
            return s;

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c;
            if(i % 2 != 0){
                c =  (char) ((s.charAt(i-1) - 'a' + (int)  s.charAt(i)) - 48 + 'a');
            }else
                c = s.charAt(i);
            res.append(c);
        }

        return res.toString();
    }
}

public class LongestUncommonSubsequence521 {
    public static void main(String[] args) {
        int result = findLUSlength("abc","cdc");
    }

    public static int findLUSlength(String a, String b) {

        if(a.equals(b))
            return -1;

        int result = Integer.MIN_VALUE;

        if(a.length() >= b.length()){
            for (int i = 0; i < a.length(); i++) {

                for (int j = i+1; j <= a.length(); j++) {
                    String temp = a.substring(i, j);
                    System.out.println(temp);
                    if (!temp.equals(b)) {
                        result = Math.max(result, temp.length());
                    }
                }
            }
        }else {
            for (int i = 0; i < b.length(); i++) {

                for (int j = i+1; j <= b.length(); j++) {
                    String temp = b.substring(i, j);
                    if (!temp.equals(a)) {
                        result = Math.max(result, temp.length());
                    }
                }
            }
        }

        return result;
    }
}

public class CountSubstringsThatSatisfyKConstraint3258 {
    public static void main(String[] args) {
        String s = "1010101";
        int k = 2;
        int result = countKConstraintSubstrings(s, k);
        System.out.println(result);
    }

    public static int countKConstraintSubstrings(String s, int k) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int oneCount = 0;
            int zeroCount = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '1')
                    oneCount++;
                if (c == '0')
                    zeroCount++;
                if ((oneCount <= k) || (zeroCount <= k))
                    count++;
            }
        }

        return count;
    }
}

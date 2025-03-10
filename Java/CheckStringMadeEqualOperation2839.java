public class CheckStringMadeEqualOperation2839 {
    public static void main(String[] args) {
        String s1 = "bnxw", s2 = "bwxn";
        boolean result = canBeEqual(s1, s2);
        System.out.println(result);
    }

    public static boolean canBeEqual(String s1, String s2) {
        if (s1.length() != 4 && s2.length() != 4) {
            return false;
        }

        if (s1.equals(s2))
            return true;

        int status = 0;

        for (int i = 0; i < 4; i++) {
            String result = "";

            if (i % 2 == 0) {
                result = swapString(s1, 1);
            } else {
                result = swapString(s1, 0);
            }
            s1 = result;
            if (s2.equals(result)) {
                status = 1;
                break;
            }
        }
        return status == 1;
    }

    public static String swapString(String s, int flag) {
        char[] res = s.toCharArray();
        if (flag == 1) {
            char temp = res[0];
            res[0] = res[2];
            res[2] = temp;
        } else {
            char temp = res[1];
            res[1] = res[3];
            res[3] = temp;
        }
        return String.valueOf(res);
    }
}

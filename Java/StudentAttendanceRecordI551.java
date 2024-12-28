public class StudentAttendanceRecordI551 {
    public static void main(String[] args) {
        String s = "PPLLLPPPPL";
        boolean result = checkRecord(s);
        System.out.println(result);
    }

    private static boolean checkRecord(String s) {

        int absent = 0;
        int late = 0;
        int lateFlag = 0;

        int start = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absent++;
            } else if (c == 'L') {
                late++;
                if (start != 0) {
                    if (s.charAt(start - 1) == 'L') {
                        lateFlag++;
                    } else {
                        lateFlag = Math.max(0, lateFlag - 1);
                    }
                }
            }
            start++;
            if (absent >= 2 || (late >= 3 && lateFlag == 2))
                return false;
        }
        return true;
    }
}

public class OccurrenceString28 {

    public static int strStr(String haystack, String needle) {

        int num = haystack.toLowerCase().indexOf(needle);

        if (num != -1)
            return num;

        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "sad";

        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}

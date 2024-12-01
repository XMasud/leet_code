public class NumberOfMatchingSubsequences792 {
    public static void main(String[] args) {
        String[] words = {"a","bb","acd","ace"};
        int result = numMatchingSubseq("abcde",words);
        System.out.println(result);
    }
    public static int numMatchingSubseq(String s, String[] words) {


        int count = 0;

        for (String word: words){
            System.out.println("Word looking -> "+ word);
            if (s.contains(word)){
                System.out.println("Found: "+word);
                count++;
            }
        }

        return count;
    }
}

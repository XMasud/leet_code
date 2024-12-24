public class MergeStringsAlternatively1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }
    private static String mergeAlternately(String word1, String word2) {
        StringBuilder result;

        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 == length2){
            result = new StringBuilder(wordMerge(word1, word2));
        } else if (length1 > length2) {
            result = new StringBuilder(wordMerge(word1.substring(0,word2.length()), word2));
            result.append(word1.substring(word2.length(),word1.length()));
        }else {
            result = new StringBuilder(wordMerge(word1, word2.substring(0,word1.length())));
            result.append(word2.substring(word1.length(),word2.length()));
        }

        return result.toString();
    }

    public static String wordMerge(String word1, String word2){

        StringBuilder result = new StringBuilder();
        int counter = 0;

        while (counter < word1.length()){
            result.append(word1.charAt(counter));
            result.append(word2.charAt(counter));
            counter++;
        }
        return result.toString();
    }
}



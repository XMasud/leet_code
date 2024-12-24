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
            result = new StringBuilder(wordMerge(word1.substring(0,length2), word2));
            result.append(word1.substring(length2, length1));
        }else {
            result = new StringBuilder(wordMerge(word1, word2.substring(0, length1)));
            result.append(word2.substring(length1, length2));
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



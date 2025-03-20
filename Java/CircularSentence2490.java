public class CircularSentence2490 {

    public static void main(String[] args) {
        String sentence = "Leetcode eisc cool";
        boolean result = isCircularSentence(sentence);
        System.out.println(result);
    }
    public static boolean isCircularSentence(String sentence) {

        String[] words = sentence.split(" ");

        char lastWordChar = words[words.length-1].charAt((words[words.length-1]).length()-1);

        if(words[0].charAt(0) != lastWordChar)
            return false;

        char lChar = 0;
        for (int i = 0; i < words.length; i++) {
            if(i != 0){
                if(lChar != words[i].charAt(0))
                    return false;
            }
            lChar = words[i].charAt((words[i]).length()-1);
        }


        return true;
    }
}

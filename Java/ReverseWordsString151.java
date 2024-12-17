public class ReverseWordsString151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String result = reverseWords(s);
        System.out.println(result);
    }

    private static String reverseWords(String s) {

        String[] words = s.trim().split(" +");
        StringBuilder newStr = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            newStr.append(words[i] + " ");
        }

        return newStr.toString().trim();
    }
}

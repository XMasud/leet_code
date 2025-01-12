public class ReverseWord557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseWords(s);
        System.out.println(result);
    }

    private static String reverseWords(String s) {
        if(s.isEmpty())
            return s;

        StringBuilder newString = new StringBuilder();
        String[] words = s.split(" ");

        for (String word: words){
            String reverseString = new StringBuilder(word).reverse().toString();
            newString.append(reverseString);
            newString.append(" ");
        }

        return newString.toString().trim();
    }
}

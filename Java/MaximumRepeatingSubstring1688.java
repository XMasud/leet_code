public class MaximumRepeatingSubstring1688 {
    public static void main(String[] args) {
        int result = maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba");
        System.out.println(result);
    }
    public static int maxRepeating(String sequence, String word) {

        int k = 0;
        String repeatedWord = "";

        while (true) {
            repeatedWord += word;
            if (sequence.contains(repeatedWord.toString())) {
                k++;
            } else {
                break;
            }
        }

        return k;
    }
}

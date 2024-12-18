public class MaximumNumberOfVowels1456 {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int result = maxVowels(s, 7);
        System.out.println(result);
    }

    private static int maxVowels(String s, int k) {

        int count = 0;
        for (int j = 0; j < k; j++) {

            if (isVowel(s.charAt(j)))
                count++;
        }

        int maxCount = count;
        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i - k)))
                count--;

            if (isVowel(s.charAt(i)))
                count++;

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}

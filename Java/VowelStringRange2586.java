import java.util.HashSet;

public class VowelStringRange2586 {

    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};
        int result = vowelStrings(words, 1, 4);
        System.out.println(result);
    }
    private static int vowelStrings(String[] words, int left, int right) {

        if (words.length < 1)
            return -1;

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];

            if(word.length() > 1){
                char start = word.charAt(0);
                char end = word.charAt(word.length()-1);

                if(vowels.contains(start) && vowels.contains(end)){
                    count++;
                }
            }else {
                char start = word.charAt(0);
                if(vowels.contains(start)){
                    count++;
                }
            }
        }

        return count;
    }
}

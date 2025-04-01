public class ReversePrefixOfWord2000 {
    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'z';
        String res = reversePrefix(word,ch);
        System.out.println(res);
    }
    public static String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();

        int index = word.indexOf(ch);

        if(index > -1){
            result.append(word, 0, index + 1).reverse().append(word, index + 1, word.length());
        }else{
            result.append(word);
        }

        return result.toString();
    }
}

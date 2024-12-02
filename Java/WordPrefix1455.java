public class WordPrefix1455 {
    public static void main(String[] args) {
        String s = "i love eating burger";
        String t = "burg";
        int result = isPrefixOfWord(s,t);
        System.out.println(result);
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {

        if(sentence.length() > 100 || searchWord.length() > 10)
            return -1;

        String[] words = sentence.split(" ");
        int i = 1;
        for (String word: words){
            if(word.length() >= searchWord.length()){
                String res = word.substring(0,searchWord.length());
                if(res.equals(searchWord)){
                    return i;
                }
            }
            i++;
        }

        return -1;
    }
}

public class PercentageOfLetterInString2278 {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'k';
        int result = percentageLetter(s,letter);
        System.out.println(result);
    }
    public static int percentageLetter(String s, char letter) {

        int counter = 0;

        for (char c: s.toCharArray()){
            if(c == letter)
                counter++;
        }

        return (counter * 100) / s.length();
    }
}

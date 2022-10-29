public class ReverseString {
    public static void reverseString(char[] s) {
        for (int i=0; i<(s.length / 2);i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] charString = {'h','a','n','n','a','h'};
        reverseString(charString);
        System.out.println(charString);
    }
}

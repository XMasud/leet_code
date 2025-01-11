import java.util.Arrays;

public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        String result = reverseOnlyLetters(s);
    }

    private static String reverseOnlyLetters(String s) {

        if(s.isEmpty())
            return null;
        int start = 0;
        int end = s.length() - 1;
        char newStr[] = s.toCharArray();

        while (start < end){
            if(!Character.isLetter(newStr[end])){
                end--;
            } else if (!Character.isLetter(newStr[start])) {
                start++;
            } else if (Character.isLetter(newStr[end]) && Character.isLetter(newStr[start])){
                char temp = newStr[start];
                newStr[start] = newStr[end];
                newStr[end] = temp;
                start++;
                end--;
            }
        }

        System.out.println(newStr);

        return String.valueOf(newStr);
    }
}

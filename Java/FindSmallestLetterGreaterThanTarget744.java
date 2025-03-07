public class FindSmallestLetterGreaterThanTarget744 {
    public static void main(String[] args) {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        if(letters.length < 2)
            return letters[0];

        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid  = start + (end - start) / 2;
            if(letters[mid] <= target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        if(start < letters.length)
            return letters[start];

        return letters[0];
    }
}

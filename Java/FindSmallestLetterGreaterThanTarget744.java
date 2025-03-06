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

        int[] nums = new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            int charLetter = letters[i] - 'a';
            nums[i] = charLetter;
        }

        int targetConversion = target - 'a';

        for (int i = 0; i < letters.length; i++) {
            if(nums[i] > targetConversion){
                return letters[i];
            } else if (nums[i] == targetConversion) {
                continue;
            }
        }
        return letters[0];
    }
}

public class TimeConversion2224 {
    public static void main(String[] args) {
        String current = "11:00";
        String correct = "11:01";
        int result = convertTime(current, correct);
        System.out.println(result);
    }

    private static int convertTime(String current, String correct) {
        String[] currentSplit = current.split(":");
        String[] correctSplit = correct.split(":");

        int currentMinutes = Integer.parseInt(currentSplit[0]) * 60 + Integer.parseInt(currentSplit[1]);
        int correctMinutes = Integer.parseInt(correctSplit[0]) * 60 + Integer.parseInt(correctSplit[1]);

        int difference = correctMinutes - currentMinutes;
        int count = 0;

        if (difference > 0) {
            while (difference > 0) {
                if (difference - 60 >= 0) {
                    difference = difference - 60;
                } else if (difference - 15 >= 0) {
                    difference = difference - 15;
                } else if (difference - 5 >= 0) {
                    difference = difference - 5;
                } else {
                    difference = difference - 1;
                }
                count++;
            }
        }

        return count;
    }
}

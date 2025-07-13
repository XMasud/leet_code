public class FindHighestAltitude1732 {
    public static void main(String[] args) {
        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int result = largestAltitude(gain);
        System.out.println(result);
    }

    public static int largestAltitude(int[] gain) {

        int result = 0;
        int highest = 0;
        int n = gain.length;

        for (int i = 0; i < n ; i++) {

            result += gain[i];
            highest = Math.max(result,highest);
        }

        return highest;
    }
}

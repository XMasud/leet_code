import java.util.Arrays;

public class MaximumPlayersWithTrainers2410 {
    public static void main(String[] args) {
        int[] players = {1,1,1};
        int[] trainers = {10};
        int result = matchPlayersAndTrainers(players, trainers);
        System.out.println(result);
    }

    private static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        if (players.length < 1 || trainers.length < 1)
            return 0;

        int count = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0;
        while (i < players.length && j < trainers.length) {

            if (trainers[j] >= players[i]) {
                i++;
                count++;
            }
            j++;
        }

        return count;
    }
}

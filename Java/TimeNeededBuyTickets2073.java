import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededBuyTickets2073 {
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        int result = timeRequiredToBuy(tickets, k);
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int n : tickets) {
            queue.add(n);
        }

        int index = 0;
        int kTrack = k;
        while (!queue.isEmpty()) {
            int value = queue.peek();

            if (index == k) {
                k = queue.size() - 1;
                kTrack--;
                if (kTrack == 0) {
                    return count;
                }
            }

            value--;
            count++;

            queue.remove();

            if (value > 0) {
                queue.offer(value);
            }
            index++;
        }

        System.out.println(count);
        return count;
    }
}

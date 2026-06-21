import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    public static void main(String[] args) {
        int[] stones = {1};
        int result = lastStoneWeight(stones);
        System.out.println(result);
    }

    private static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> sortedPQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones)
            sortedPQ.add(stone);

        while (sortedPQ.size() > 1){

            int fElement = sortedPQ.poll();
            int sElement = sortedPQ.poll();

            if(fElement - sElement > 0)
                sortedPQ.add(fElement - sElement);
        }

        if(sortedPQ.isEmpty())
            return 0;

        return sortedPQ.poll();
    }
}

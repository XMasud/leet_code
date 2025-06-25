import java.util.HashMap;
import java.util.Map;

public class MaximumDifferenceBetweenEvenOddFrequency3442 {
    public static void main(String[] args) {
        String s = "aaaaabbc";
        int result = maxDifference(s);
        System.out.println(result);
    }
    public static int maxDifference(String s) {
        int evenFrequency = Integer.MAX_VALUE;
        int oddFrequency = 0;

        HashMap<Character, Integer> frequencies = new HashMap<>();

        for (char c: s.toCharArray()){
            frequencies.put(c, frequencies.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: frequencies.entrySet()){
            if(entry.getValue() % 2 == 0){
                evenFrequency = Math.min(evenFrequency,entry.getValue());
            }else{
                oddFrequency = Math.max(oddFrequency, entry.getValue());
            }
        }

        return Math.abs(oddFrequency - evenFrequency);
    }
}

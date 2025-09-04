import java.util.*;

public class UncommonWords884 {
    public static void main(String[] args) {
        String s1 = "s z z z s";
        String s2 = "s z ejt";
        String[] result = uncommonFromSentences(s1,s2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String,Integer> res = new HashMap<>();
        List<String> uncommonWords = new ArrayList<>();

        for (String s: s1.split(" ")){
            res.put(s,res.getOrDefault(s,0)+1);
        }

        for (String s: s2.split(" ")){
            res.put(s,res.getOrDefault(s,0)+1);
        }

        for (Map.Entry<String,Integer> entry: res.entrySet()){
            if(entry.getValue() == 1)
                uncommonWords.add(entry.getKey());
        }

        return uncommonWords.toArray(new String[0]);
    }
}

import java.util.HashMap;

public class CheckDistancesBetweenSameLetters2239 {
    public static void main(String[] args) {
        String s = "rryzglzgyl";
        int[] distance = {1,9,22,36,3,20,2,42,47,5,35,3,11,37,14,37,44,0,15,9,19,44,16,32,5,2};
        boolean result = checkDistances(s,distance);
        System.out.println(result);
    }

    public static boolean checkDistances(String s, int[] distance) {

        if(s.length() <= 1)
            return false;

        HashMap<Integer,Integer> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';

            if(result.containsKey(val)){
                int temp = result.get(val);
                result.put(val,i - temp);
            }else{
                result.put(val,i+1);
            }
        }

        for (int i = 0; i < 26; i++) {

           if(result.containsKey(i)){
               if(result.get(i) != distance[i]){
                   return false;
               }
           }
        }
        return true;
    }

}

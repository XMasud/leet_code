import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i=0; i < magazine.length(); i++){
            if (magazineMap.containsKey(magazine.charAt(i))){
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
            }else {
                magazineMap.put(magazine.charAt(i), 1);
            }
        }

        Map<Character, Integer> ransomNoteMap = new HashMap<>();

        for (int i=0; i < ransomNote.length(); i++){
            if (ransomNoteMap.containsKey(ransomNote.charAt(i))){
                ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.get(ransomNote.charAt(i)) + 1);
            }else {
                ransomNoteMap.put(ransomNote.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()){
            Integer value = entry.getValue();
            Character key = entry.getKey();

            if(!magazineMap.containsKey(key) || magazineMap.get(key) < value){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String ransomNote ="aa";
        String magazine ="aab";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}

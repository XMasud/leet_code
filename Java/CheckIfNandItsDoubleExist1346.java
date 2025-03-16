import java.util.HashMap;

public class CheckIfNandItsDoubleExist1346 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        boolean result = checkIfExist(arr);
        System.out.println(result);
    }
    public static boolean checkIfExist(int[] arr) {

        HashMap<Integer,Integer> maps = new HashMap<>();
        int counter = 0;
        for (int n: arr){
            counter++;
            maps.put(n,counter);
        }

        counter = 0;
        for (int n: arr){
            if(maps.containsKey(n*2)){
                if(counter != (maps.get(n*2) - 1))
                    return true;
            }
            counter++;
        }

        return false;
    }
}

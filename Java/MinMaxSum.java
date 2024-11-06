import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {

        arr.sort(Comparator.reverseOrder());

        System.out.println(arr.get(0));

        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (i != 0) {
                min = min + arr.get(i);
            }

            if (i != arr.size() - 1) {
                max = max + arr.get(i);
            }
        }
        //System.out.println(min + " " + max);
        String s = "12:00:00AM";
        String[] splitedString = s.split(":");
        System.out.println(splitedString[2].substring(2,4));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String[] splitedString = s.split(":");
        int hour = Integer.parseInt(splitedString[0]) ;
        String minutes = splitedString[1];
        String seconds = splitedString[2].substring(0, 2);
        String format = splitedString[2].substring(2, 4);

        String newFormat="";
        int newHour = 0;
        if(format.equals("PM")){

            if(hour<12){

                newHour = hour + 12;
                newFormat = String.valueOf(newHour)+ ":"+ minutes+ ":" +seconds;
            }else{

                newFormat = String.valueOf(hour)+ ":"+ minutes+ ":" +seconds;
            }
        }else{
            System.out.println(format);
            if(hour>=12){
                newHour = 12 - hour;
                if(newHour < 10){
                    newFormat = "0"+String.valueOf(newHour)+ ":"+ minutes+ ":" +seconds;
                }else{
                    newFormat = String.valueOf(newHour)+ ":"+ minutes+ ":" +seconds;
                }
            }else{
                if(newHour < 10){
                    newFormat = "0"+String.valueOf(hour)+ ":"+ minutes+ ":" +seconds;
                }else{
                    newFormat = String.valueOf(hour)+ ":"+ minutes+ ":" +seconds;
                }
            }
        }
        System.out.println(newFormat);
        return newFormat;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(4);
       // miniMaxSum(arr);
      //  String s = "07:05:45PM";
       // timeConversion(s);
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1].length);
    }
}

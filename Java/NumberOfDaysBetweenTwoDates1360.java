public class NumberOfDaysBetweenTwoDates1360 {
    public static void main(String[] args) {
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        int result = daysBetweenDates(date1, date2);
        System.out.println(result);
    }
    public static int daysBetweenDates(String date1, String date2) {

        String[] date1Array = date1.split("-");
        String[] date2Array = date2.split("-");

        int yearDiff = 0;

        if(Integer.valueOf(date1Array[0]) >= Integer.valueOf(date2Array[0])){
            yearDiff = Integer.valueOf(date1Array[0])- Integer.valueOf(date2Array[0]);
        }else{
            yearDiff = Integer.valueOf(date2Array[0])- Integer.valueOf(date1Array[0]);
        }

        int monthDiff = 0;
        if(Integer.valueOf(date1Array[1]) >= Integer.valueOf(date2Array[1])){
            yearDiff = Integer.valueOf(date1Array[1])- Integer.valueOf(date2Array[1]);
        }else{
            yearDiff = Integer.valueOf(date2Array[1])- Integer.valueOf(date1Array[1]);
        }


        return yearDiff*365 + monthDiff;
    }
}





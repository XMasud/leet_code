public class CrawlerLogFolder1598 {
    public static void main(String[] args) {
        String[] logs = {"./","../","./"};
        int result = minOperations(logs);
        System.out.println(result);
    }
    public static int minOperations(String[] logs) {
        int count = 0;

        for (String log: logs){
            if(log.equals("../")){
                if(count > 0){
                    count--;
                }
            } else if (log.equals("./")) {

            }else {
                count++;
            }
        }

        return count;
    }
}

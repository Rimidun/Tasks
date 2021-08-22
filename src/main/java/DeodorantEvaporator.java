public class DeodorantEvaporator {
    public static void main(String[] args) {
        double content = 10;
        double evap_per_day = 10;
        double threshold = 10;


        System.out.println(evaporator(content, evap_per_day, threshold));


    }

    public static int evaporator(double content, double evap_per_day, double threshold) {


        double lifeOfEvaporator = content * (threshold / 100);
        int day = 0;
        while (content > lifeOfEvaporator) {
            content = ((content * (evap_per_day / 100) * (-1)) + content);
            day++;
        }
        return day;
    }
}

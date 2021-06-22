public class ClockShowAfterMidnight {
    public static void main(String[] args) {

        int h = 0;
        int m = 1;
        int s = 1;


        Past(h,m,s);
    }

    public static int Past(int h, int m, int s) {

        int timePassed = (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000);

        return timePassed;
    }
}

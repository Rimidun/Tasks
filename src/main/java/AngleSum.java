public class AngleSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfAngles(n));
    }
    public static int sumOfAngles(int n){
        if (n < 3)
            return 0;
        return (n - 2) * 180;
    }
}

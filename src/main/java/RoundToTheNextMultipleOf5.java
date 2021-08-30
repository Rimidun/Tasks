public class RoundToTheNextMultipleOf5 {
    public static void main(String[] args) {
        double number = -3;
        System.out.println(roundToNext5(number));
    }

    public static int roundToNext5(double number) {
        return (int)Math.ceil(number/5)*5;
    }
}

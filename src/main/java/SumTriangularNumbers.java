public class SumTriangularNumbers {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(SumTriangularNumbers(n));

    }

    public static int SumTriangularNumbers(int n){
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += (i * (i + 1)) / 2;
        }
        return sum;
    }
}

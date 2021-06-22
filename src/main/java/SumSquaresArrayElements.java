public class SumSquaresArrayElements {
    public static void main(String[] args) {
        int[] n = {6, 5, 4};
        System.out.println(sumSquares(n));
    }

    public static int sumSquares(int[] n) {

        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            //System.out.println(Math.pow(n[i],2));
            sum += Math.pow(n[i],2);
        }
        return sum;


    }
}

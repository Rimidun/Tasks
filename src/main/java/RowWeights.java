public class RowWeights {
    public static void main(String[] args) {
        final int[] weight = {99, 105, 33, 28, 29};
        rowWeights(weight);
    }

    public static int[] rowWeights(final int[] weights) {

        int first = 0;
        int second = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                first += weights[i];
            } else {
                second += weights[i];
            }

        }

        System.out.println(first + " " + second);

        return new int[]{first, second};

    }
}

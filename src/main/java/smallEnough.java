public class smallEnough {
    public static void main(String[] args) {
        int[] array = {66, 11, 8, 14, 22, 74};
        int limit = 74;
        System.out.println(smallEnough(array, limit));
    }

    public static boolean smallEnough(int[] array, int limit) {

        boolean solution = true;

        for (int i = 0; i < array.length; i++) {
            if (limit < array[i]) {
                solution = false;
                break;
            }
        }
        return solution;
    }
}

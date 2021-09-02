import java.util.Arrays;

public class MinSum {
    public static void main(String[] args) {
        int[] passed = {9, 2, 8, 7, 5, 4, 0, 6};
        System.out.println(minSumFirst(passed));
        System.out.println(minSumSecond(passed));

    }

    public static int minSumFirst(int passed[]) {
        Arrays.sort(passed);
        int value = 0;
        int f = 0;
        int l = passed.length - 1;

        for (int i = 0; i < passed.length / 2; i++) {
            value += passed[f] * passed[l];
            f++;
            l--;
        }
        return value;
    }

    public static int minSumSecond(int passed[]) {
        Arrays.sort(passed);
        int value = 0;

        for (int i = 0; i < passed.length / 2; i++)
            value += passed[i] * passed[passed.length - 1 - i];

        return value;
    }
}

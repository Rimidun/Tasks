import java.util.Arrays;

public class NumberDivisible {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int divider = 2;

        System.out.println(Arrays.toString(divisible1(numbers, divider)));
        System.out.println(divisible2(numbers, divider));


    }
    //method 1
    public static int[] divisible1(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0)
                count++;
        }

        int[] array = new int[count];
        int j = 0;

        for (int number : numbers) {
            if (number % divider == 0) {
                array[j] = number;
                j++;
            }
        }

        return array;
    }

    //method 2
    public static int[] divisible2(int[] numbers, int divider) {

        return Arrays.stream(numbers).filter(i->(i%divider)==0).toArray();

    }


}

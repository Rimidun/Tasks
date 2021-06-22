import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class ValueDoubled {
    public static void main(String[] args) {

        int[] arr = new int[]{8, 25, 7, 9, 15};
        map(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] map(int[] arr) {

        int[] array = arr;

        for (int i = 0; i < array.length; ++i)
            array[i] = array[i] * 2;
        return array;


    }


}

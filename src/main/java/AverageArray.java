import java.util.Arrays;

public class AverageArray {

    public static void main(String[] args) {

        int[] array = {9,4,5,1,232,32,1};

        System.out.println(average(array));
    }

    public static double average(int[] array) {
        //first method
//        double average = 0;
//        double sum = 0;
//
//        if (array.length < 1) {
//            return 0;
//        } else {
//            for (int i = 0; i < array.length; i++)
//                sum += array[i];
//            average = sum / array.length;
//        }
//        return average;

        //second method
        return Arrays.stream(array).average().getAsDouble();
    }


}

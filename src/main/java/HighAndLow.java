import java.util.Arrays;

public class HighAndLow {
    public static void main(String[] args) {
        String numbers = "1 2 3 4 5 8 11 0 2";
        System.out.println(highAndLow(numbers));
    }
    public static String highAndLow ( String  numbers){
        int[] numberInt = Arrays.stream(numbers.split("\\s")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numberInt);
        int firstNum = numberInt[0];
        int lastNum = numberInt[numberInt.length-1];

        String result = Integer.toString(lastNum) + " " + Integer.toString(firstNum);
        return result;
    }
}

import java.util.*;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class BiggerAndSmallerElementArray {
    public static void main(String[] args) {
        //Scanner stroka = new Scanner(System.in);
        //String strokaString = stroka.nextLine();
        String number = "1 2 99 7 5 4 2 103 4 3 2 0";

        lalala(number);
    }

    public static String lalala(String number) {

        int[] numberInt = Arrays.stream(number.split("\\s")).mapToInt(Integer::parseInt).toArray();// string in int array
        Arrays.sort(numberInt); //sorting arrays
        int firstNum = numberInt[0]; //smaller element array
        int lastNum = numberInt[numberInt.length - 1]; //bigger element array

        String result = Integer.toString(lastNum) + " " + Integer.toString(firstNum); //int to string
        System.out.println(result);//output
        return result;

    }
}

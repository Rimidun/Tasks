import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class BiggerAndSmallerElementArray {
    public static void main(String[] args) {
        //Scanner stroka = new Scanner(System.in);
        //String strokaString = stroka.nextLine();
        String number = "1 2 99 7 5 4 2 103 4 3 2 0";
        int number1[] = {1, 5, 6, 44, 7, 99, 2, 4, 6, 23, 42, 41, 24};

        lalala(number);
        x(number1);
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

    public static int x(int name[]) {
        int y = 0;
        Integer[] integers = Arrays.stream(name).boxed() // упаковка в Integer
                .sorted(Collections.reverseOrder()) // сортировка
                .toArray(Integer[]::new);

        Arrays.stream(integers).map((s) -> s + " ") // пробел между элементами
                .forEach(System.out::print); //Вывод в консоль

        return y;
    }
}

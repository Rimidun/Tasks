import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareDigit {
    public static void main(String[] args) {

        int n = 24659;

        System.out.println(squareDigits(n));



    }

    public static int squareDigits(int n) {

        int y = 0; //переменнаая для умножения
        int[] arrays = new int[String.valueOf(n).length()]; //создали массив длинной как исходный инт

        for (int i = String.valueOf(n).length() - 1; i > -1; i--) {
            y = n % 10;
            n /= 10;
            arrays[i] = y * y;  //заполнили массив с конца удвоенными числами инт
        }

        String str = Arrays.stream(arrays)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()); //получаем из каждого числа строку и соединяем строки

        int num = Integer.parseInt(str); // преобразовываем строку в число

        return num;
    }

}

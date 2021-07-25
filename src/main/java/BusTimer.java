import java.text.SimpleDateFormat;
import java.util.Date;

public class BusTimer {
    public static void main(String[] args) {

        long n = 352222311;

        digitize(n);



    }

    public static int[] digitize(long n) {

        int[] digitize = new int[String.valueOf(n).length()];

        long y = 1;

        for (int i = 0; i < digitize.length; i++) {
            y = n % 10;
            n /= 10;
            digitize[i] = (int)y;  //заполнили массив с конца удвоенными числами инт
        }

        for (int i = 0; i < digitize.length; i++) {
            System.out.print(digitize[i]);

        }

        return digitize;
    }
}

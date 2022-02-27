import java.util.LinkedList;
import java.util.List;

public class DivisionInColumn {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;

        System.out.println(div(a, b));
    }

    public static long div(long dividend, long divisor) {
        long quotient = 0;
        int k = 0;
        while (divisor <= dividend && divisor > 0) {
            divisor <<= 1;
            k++;
        }
        while (k-- > 0) {
            divisor >>= 1;
            if (divisor <= dividend) {
                dividend -= divisor;
                quotient = (quotient << 1) + 1;
            }
            else quotient <<= 1;
        }
        return quotient;
    }


}

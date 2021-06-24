import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigPower {
    public static void main(String[] args) throws Exception {

        long a = 1;
        long b = 210;
        //sumDigPow(a, b);

        sumDigPow(a, b);

    }

    public static List<Integer> sumDigPow(long a, long b) throws Exception {

        List<Integer> arrays = new ArrayList<>(Arrays.asList(1, 2, 5, 7, 9, 6, 4, 3, 5, 7, 9, 6, 545, 202, 56523, 52, 122, 44, 66, 88));
        List<Integer> newlist = new ArrayList<>();

        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i) >= a & arrays.get(i) <= b) {
                System.out.println("Переменная " + arrays.get(i) + " входит в диапазон");
                newlist.add(arrays.get(i));
            } else {
                System.out.println("Переменная " + arrays.get(i) + " не входит в диапазон");
                //arrays.remove(i);
                //System.out.println("Удалили эту переменную");
            }
            //System.out.println(arrays);
        }

        newlist.stream().sorted().map((s) -> s + " ").forEach(System.out::print);


        return arrays;


    }
}

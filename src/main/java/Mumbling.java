import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mumbling {
    public static void main(String[] args) {
        String s = "Wdaawdawdawdrq";
        System.out.println(accum(s));

    }

    public static String accum(String s){
        char[] chars = s.toUpperCase().toCharArray();
        return IntStream
                .range(0, chars.length)
                .mapToObj(index -> chars[index] + Stream.generate(() -> String.valueOf(chars[index]))
                        .limit(index)
                        .collect(Collectors.joining())
                        .toLowerCase()).collect(Collectors.joining("-"));


    }
}

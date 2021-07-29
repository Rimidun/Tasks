import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mumbling {
    public static void main(String[] args) {
        String s = "Wdaawdawdawdrq";
        System.out.println(accum1(s));

        System.out.println(accum2(s));

    }

    public static String accum1(String s){
        char[] chars = s.toUpperCase().toCharArray();
        return IntStream
                .range(0, chars.length)
                .mapToObj(index -> chars[index] + Stream.generate(() -> String.valueOf(chars[index]))
                        .limit(index)
                        .collect(Collectors.joining())
                        .toLowerCase()).collect(Collectors.joining("-"));


    }

    public static String accum2(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }


}

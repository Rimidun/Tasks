
import org.apache.commons.lang3.StringUtils;

public class ReverseWords {
    public static void main(String[] args) {
        final String word = "elbuod  decaps  sdrow";
        final String in = "";

        System.out.println(reverseWord(word));

        System.out.println(reverseWordSecond(in, word));

        System.out.println(reverseWordThird(word));

    }

    public static String reverseWord(String word) {
        return StringUtils.reverseDelimited(StringUtils.reverse(word), ' ');

    }

    public static String reverseWordSecond(String in, String word) {
        return (in.isEmpty()) ? word :
                (in.charAt(0) == ' ')
                        ? word + ' ' + reverseWordSecond(in.substring(1), "")
                        : reverseWordSecond(in.substring(1), in.charAt(0) + word);
    }

    public static String reverseWordThird(String word) {
        StringBuilder sb = new StringBuilder(word.length());
        StringBuilder wsb = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (c == '\t' || c == ' ')
            {
                if (wsb.length() > 0)
                {
                    sb.append(wsb.reverse().toString());
                    wsb = new StringBuilder(word.length() - sb.length());
                }
                sb.append(c);
            }
            else
            {
                wsb.append(c);
            }
        }
        if (wsb.length() > 0)
        {
            sb.append(wsb.reverse().toString());
        }
        return sb.toString();
    }
}

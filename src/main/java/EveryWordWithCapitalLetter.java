import java.util.Locale;

public class EveryWordWithCapitalLetter {
    public static void main(String[] args) {

        String phrase = "раз два три";

        System.out.println(toJadenCase(phrase));


    }

    public static String toJadenCase(String phrase) {


        if (phrase == null) {
            return phrase = null;
        } else if (phrase.isEmpty() == true) {

            return phrase = null;
        }
        char[] chars = phrase.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }

        phrase = new String(chars);
        return phrase;


    }
}

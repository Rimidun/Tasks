import java.util.Locale;

public class IsIsogram {
    public static void main(String[] args) {
        String str = "moOse";

        System.out.println(isIsogram(str));


    }
    public static boolean isIsogram(String str){

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toCharArray()[i] == str.toCharArray()[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

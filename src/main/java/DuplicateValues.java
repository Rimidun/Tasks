import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateValues {
    public static void main(String[] args) {

        String[] passwords = new String[]{
                "qwerty", "123123", "qweasd", "jhsnbju", "123",
                "qwerty", "741852", "123123", "mvnxjdnj$3", "qwerty",
                "eeeee", "123", "jsjsjs", "qwerty", "123123"};

        printTop3(passwords);


    }

    public static void printTop3(String... pass) {
        List<String> allPassword = new ArrayList<String>(Arrays.asList(pass)); //Перенос массива в лист
        Map<String, Integer> frequency = allPassword.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum)); //перенос листа в карту
        frequency.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).forEach(System.out::println); //вывод повторений по убываюнию, пароль - количество повторений
    }

}

public class example {


    public static void main(String[] args) {
        int dividend = 1;
        int divisor = 2;

        System.out.println(makeDivision(226, 4));

    }

    public static StringBuilder result = new StringBuilder();
    public static StringBuilder quotient = new StringBuilder();
    public static StringBuilder reminder = new StringBuilder();

    public static String makeDivision(int dividend, int divisor) {

        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be 0, division by zero");
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (dividend < divisor) {
            return "" + dividend + "/" + divisor + "=0";
        }

        String[] digits = String.valueOf(dividend).split("");
        Integer reminderNumber;
        Integer multiplyResult;
        Integer divisorDigit = calculateDigit(divisor);
        Integer mod;

        for (int i = 0; i < digits.length; i++) {
            reminder.append(digits[i]);
            reminderNumber = Integer.parseInt(reminder.toString());

            if (reminderNumber >= divisor) {
                mod = reminderNumber % divisor;
                multiplyResult = reminderNumber / divisor * divisor;

                String lastReminder = String.format("%" + (i + 2) + "s", "_" + reminderNumber.toString());
                result.append(lastReminder).append("\n");

                String multiply = String.format("%" + (i + 2) + "d", multiplyResult);
                result.append(multiply).append("\n");

                Integer tab = lastReminder.length() - calculateDigit(multiplyResult);
                result.append(makeDivider(reminderNumber, tab)).append("\n");

                quotient.append(reminderNumber / divisor);

                reminder.replace(0, reminder.length(), mod.toString());
                reminderNumber = Integer.parseInt(reminder.toString());
            } else {
                if (i >= divisorDigit) {
                    quotient.append(0);
                }
            }

            if (i == digits.length - 1) {
                result.append(String.format("%" + (i + 2) + "s", reminderNumber.toString())).append("\n");
            }
        }
        modifyResultToView(dividend, divisor);
        return result.toString();
    }

    public static String makeDivider(Integer reminderNumber, Integer tab) {
        return assemblyString(tab, ' ') + assemblyString(calculateDigit(reminderNumber), '-');
    }

    public static void modifyResultToView(Integer dividend, Integer divisor) {
        int[] index = new int[3];
        for (int i = 0, j = 0; i < result.length(); i++) {
            if (result.charAt(i) == '\n') {
                index[j] = i;
                j++;
            }

            if (j == 3) {
                break;
            }
        }

        int tab = calculateDigit(dividend) + 1 - index[0];
        result.insert(index[2], assemblyString(tab, ' ') + "│" + quotient.toString());
        result.insert(index[1], assemblyString(tab, ' ') + "│" + assemblyString(quotient.length(), '-'));
        result.insert(index[0], "│" + divisor);
        result.replace(1, index[0], dividend.toString());
    }

    public static int calculateDigit(int i) {
        return (int) Math.log10(i) + 1;
    }

    public static String assemblyString(int numberOfSymbols, char symbol) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numberOfSymbols; i++) {
            string.append(symbol);
        }
        return string.toString();
    }
}

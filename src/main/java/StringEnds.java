public class StringEnds {
    public static void main(String[] args) {
        String str = "abcdf";
        String ending = "df";
        System.out.println(solutionFirst(str, ending));
        System.out.println(solutionSecond(str, ending));

    }

    public static boolean solutionFirst(String str, String ending) {
        int length = ending.length();
        String end = str.substring(Math.max(0, str.length() - length));

        if (end.equals(ending)) {
            return true;
        } else return false;
    }

    public static boolean solutionSecond(String str, String ending) {
        return str.endsWith(ending);
    }
}

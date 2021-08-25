public class SortAndStar {
    public static void main(String[] args) {
        String [] string = {"b***i***t***c***o***i***n"};
        System.out.println(twoSort(string));
    }
    public static String twoSort(String[] string){

        return String.join("***",string[0].split(""));

    }

}

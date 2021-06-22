public class DeleteVowelsWordsString {
    public static void main(String[] args) {
        String string = "This website is for losers LOL!";
        System.out.println(deleteVowelsWord(string));
    }

    public static String deleteVowelsWord(String string){
        //string.replaceAll("[a, e, i, o, u]","");

        return string.replaceAll("[AEIOUaeiou]","");

    }
}

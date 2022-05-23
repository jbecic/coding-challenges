import java.util.Arrays;

public class lowerCaseWordInUpperCaseLetters {
    public static String detectWord(String str) {
        String output = "";
        String[] lowerCase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < str.length(); i++) {
            for(int j = 0; j < lowerCase.length; j++) {
                if (String.valueOf(str.charAt(i)).equals(lowerCase[j])) {
                    output += str.charAt(i);
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(detectWord("UcUNFYGaFYFYGtNUH"));
        System.out.println(detectWord("bEEFGBuFBRrHgUHlNFYaYr"));
        System.out.println(detectWord("YFemHUFBbezFBYzFBYLleGBYEFGBMENTment"));
    }
}

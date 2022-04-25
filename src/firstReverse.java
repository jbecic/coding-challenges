public class firstReverse {
    public static String rev(String s) {
        String output = "";

        for (int i = s.length() - 1; i > -1; i--) {
            output += s.charAt(i);
        }

        return output;
    }

    public static void main(String[] args) {
        String str1 = "coderbyte";
        String str2 = "I Love Code";

        System.out.println(rev(str1));
        System.out.println(rev(str2));
    }
}

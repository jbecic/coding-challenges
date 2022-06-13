public class charCount {
    public static int charCount(Character target, String str) {
        int output = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                output += 1;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Character target1 = 'a';
        Character target2 = 'c';
        Character target3 = 'b';

        String string1 = "edabit";
        String string2 = "Chamber of secrets";
        String string3 = "big fat bubble";

        System.out.println(charCount(target1, string1));
        System.out.println(charCount(target2, string2));
        System.out.println(charCount(target3, string3));
    }
}

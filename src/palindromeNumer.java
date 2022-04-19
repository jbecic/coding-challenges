public class palindromeNumer {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String rev = "";
        for (int i = (s.length() - 1); i > -1; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(isPalindrome(num1));
        System.out.println(isPalindrome(num2));
        System.out.println(isPalindrome(num3));
    }
}

public class addBinary {
    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        String output = Integer.toBinaryString(num1 + num2);

        return output;
    }

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "1";
        String str3 = "1010";
        String str4 = "1011";

        System.out.println(addBinary(str1, str2));
        System.out.println(addBinary(str3, str4));
    }
}

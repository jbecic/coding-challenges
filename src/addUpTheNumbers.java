public class addUpTheNumbers {
    public static int addUp(int num) {
        int output = 0;

        for (int i = 0; i <= num; i++) {
            output += i;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(addUp(4));
        System.out.println(addUp(13));
        System.out.println(addUp(600));
    }
}

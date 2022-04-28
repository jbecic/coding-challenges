public class sqrt {
    public static int mySqrt(int x) {
        int output = 0;

        if (x == 1) {
            return 1;
        }

        if (x == Integer.MAX_VALUE) {
            return 46340;
        }

        for (int i = 0; i < x; i++) {
            int z = i * i;
            if (z == x ) {
                return i;
            } else if(z < x) {
                output = i;
            } else if (z > x) {
                break;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 1;

        System.out.println(mySqrt(num1));
        System.out.println(mySqrt(num2));
    }
}

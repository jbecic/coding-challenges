public class areaOfTriangle {
    public static int aot(int base, int height) {
        return base * height / 2;
    }

    public static void main(String[] args) {
        System.out.println(aot(3,2));
        System.out.println(aot(7,4));
        System.out.println(aot(10,10));
    }
}

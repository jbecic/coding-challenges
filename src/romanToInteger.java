import java.util.Hashtable;

public class romanToInteger {
    public static int romanToInt(String s) {
        Hashtable <String, Integer> myDict = new Hashtable<String, Integer>();
        int num = 0;

        myDict.put("M", 1000);
        myDict.put("D", 500);
        myDict.put("C", 100);
        myDict.put("L", 50);
        myDict.put("X", 10);
        myDict.put("V", 5);
        myDict.put("I", 1);

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && myDict.get(String.valueOf(s.charAt(i))) > myDict.get(String.valueOf(s.charAt(i - 1)))) {
                num += myDict.get(String.valueOf(s.charAt(i))) - 2 * myDict.get(String.valueOf(s.charAt(i - 1)));
            } else {
                num += myDict.get(String.valueOf(s.charAt(i)));
            }
        }

        return num;
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
    }
}

public class longestCommonPrefix {
    public static String commonPrefix(String str1, String str2) {
        String res = "";
        int len = 0;

        if (str1.length() > str2.length()) {
            len = str2.length();
        } else {
            len = str1.length();
        }

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }
            res += str1.charAt(i);
        }

        return res;
    }

    public static String lcp(String arr[]) {
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix = commonPrefix(prefix, arr[i]);
        }

        return prefix;
    }

    public static String longestCommonPrefix(String[] strs) {
        return lcp(strs);
    }

    public static void main(String[] args) {
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
    }
}

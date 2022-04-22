public class ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        int output = 0;
        boolean pass = false;

        if (haystack.length() == 1 && needle.length() == 1) {
            if (haystack.charAt(0) == needle.charAt(0)) {
                return output;
            }
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (pass == true) {
                    break;
                }
                output = i;
                if (needle.length() == 1) {
                    return output;
                }
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) {
                        return -1;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        if (j == needle.length() - 1) {
                            pass = true;
                        }
                    }
                }
            }
        }

        if (pass == true) {
            return output;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "hello";
        String needle1 = "ll";
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        String haystack3 = "mississippi";
        String needle3 = "sipp";

        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
    }
}

public class longestWord {
    public static String longestWord(String sen) {
        String output = "";
        int len = 0;
        String[] arr = sen.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLetter(arr[i].charAt(j))) {
                    if (j > len) {
                        len = j;
                        output = arr[i].substring(0, j + 1);
                    }
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String str1 = "fun&!! time";
        String str2 = "I love dogs";

        System.out.println(longestWord(str1));
        System.out.println(longestWord(str2));
    }
}

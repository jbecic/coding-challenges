import java.util.ArrayDeque;
import java.util.Deque;

public class validParentheses {
    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                st.push(x);
                continue;
            }

            if (st.isEmpty()) {
                return false;
            }

            else if (x ==')' && st.peek() == '(') {
                st.pop();
            }
            else if (x =='}' && st.peek() == '{') {
                st.pop();
            }
            else if (x ==']' && st.peek() == '[') {
                st.pop();
            }
            else {
                st.push(x);
            }
        }


        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
}

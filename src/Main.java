import java.util.Stack;

class ReverseWord {
    public static void reverseWord(String str) {
        int n = str.length();
        Stack<Character> reverse = new Stack<>();

        // Traverse given string and push all
        // characters to stack until we see a space.
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                reverse.push(str.charAt(i));
            }
            // When we see a space, we print
            // contents of stack.


            else {
                while (reverse.empty() == false) {
                    System.out.print(reverse.pop());
                }
                System.out.print(" ");
            }


        }

        // Since there may not be space after
        // last word.

        while (reverse.empty() == false) {
            System.out.print(reverse.pop());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        String str=" hell0 world I am java";
        ReverseWord.reverseWord(str);
    }
}
import java.util.*;

public class ValidParentheses {

    /*    Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false*/
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char value = s.charAt(i);
            if (value == '(' || value == '[' || value == '{') {
                if (value == '('){
                    stack.push(')');
                } else if (value == '['){
                    stack.push(']');
                } else {
                    stack.push('}');
                }
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char valueHead = stack.pop();
                if (valueHead != value){
                    return false;
                }
            }
        }

        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}

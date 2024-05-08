import java.util.HashMap;
import java.util.Map;

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
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', '(');
        map.put(')', ')');
        map.put('[', '[');
        map.put(']', ']');
        map.put('{', '{');
        map.put('}', '}');

        for (int )
    }
}

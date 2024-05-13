package easy;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    /*    Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/
    public static String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {

                if ( i == strs[j].length()  || strs[0].charAt(i) != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
            return strs[0];
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "a"};
        System.out.println(longestCommonPrefix(strings));
    }
}

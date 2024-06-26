package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
/*    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000*/

    /*    Example 1:

        Input: s = "III"
        Output: 3
        Explanation: III = 3.
        Example 2:

        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.
        Example 3:

        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Map<String, Integer> mapConst = new HashMap<>();
        mapConst.put("IV", 4);
        mapConst.put("IX", 9);
        mapConst.put("XL", 40);
        mapConst.put("XC", 90);
        mapConst.put("CD", 400);
        mapConst.put("CM", 900);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
                    int j = i + 1;
                    char next = s.charAt(j);
                    String key = new String(new char[]{s.charAt(i), next});
                    Integer value = mapConst.get(key);
                    if (value != null) {
                        total = total + value;
                        i++;
                    } else {
                        total = total + map.get(s.charAt(i));
                    }
                } else {
                    total = total + map.get(s.charAt(i));
                }
            } else {
                total = total + map.get(s.charAt(i));
            }
        }
        return total;
    }

    public static int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (map.get(s.charAt(i)) >= map.get(s.charAt(i+1)) ) {
                    total = total + map.get(s.charAt(i));
                } else {
                    total = total - map.get(s.charAt(i));
                }
            } else {
                total = total + map.get(s.charAt(i));
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String data = "III";
        System.out.println(romanToInt2(data));
    }
}

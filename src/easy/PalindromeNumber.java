package easy;

public class PalindromeNumber {
    /*Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.*/

    public static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        StringBuilder sb = new StringBuilder(strX);
        sb.reverse();

        if (sb.toString().equals(strX)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(int x) {

        if ((x < 0) || ((x % 10 == 0) && (x != 0))) {
            return false;
        }

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x/10;
        }

        if (x == rev || x == rev/10){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(121));
    }
}
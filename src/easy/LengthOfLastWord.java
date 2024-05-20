package easy;

public class LengthOfLastWord {
    /**
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     *
     * A word is a maximal
     * substring
     *  consisting of non-space characters only
     */
    /**
     * Example 1:
     *
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     * Example 2:
     *
     * Input: s = "   fly me   to   the moon  "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     * Example 3:
     *
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     */
    public int lengthOfLastWord(String s) {
        int wordLenght = 0;
        boolean flag = false;
        for (int i = s.length() - 1 ; i >= 0 ; i--){
            if (i == s.length() - 1){
                if (s.charAt(i) != ' '){
                    flag = true;
                    wordLenght++;
                }
            } else {
                if (s.charAt(i) == ' '){
                    if(flag){
                        break;
                    }
                } else {
                    flag = true;
                    wordLenght++;
                }
            }

        }
        return wordLenght;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("luffy"));
    }
}

package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int maxIndexHaystack = haystack.length() - 1;
        int maxIndexNeedle = needle.length() - 1;

        if (maxIndexNeedle > maxIndexHaystack){
            return -1;
        }

        int pivot = maxIndexHaystack - maxIndexNeedle;
        char firstCharHaystack = needle.charAt(0);
        int index = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (firstCharHaystack == haystack.charAt(i)) {
                index = i;
                if (i > pivot){
                    return -1;
                } else {
                    int a = 1;
                    for (int j = i + 1; j < i + needle.length() ; j ++ ){
                        if (haystack.charAt(j) != needle.charAt(a)){
                            break;
                        }
                        a++;
                    }
                    if (a == needle.length()){
                        return index;
                    } else {
                        index = -1;
                    }
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();
        System.out.println(findTheIndexOfTheFirstOccurrenceInAString.strStr("leetcode", "leeto"));
    }
}

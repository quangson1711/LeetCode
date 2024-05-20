package easy;

public class PlusOne {
    /**
     * Example 1:
     * <p>
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     * Example 2:
     * <p>
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     * Example 3:
     * <p>
     * Input: digits = [9]
     * Output: [1,0]
     * Explanation: The array represents the integer 9.
     * Incrementing by one gives 9 + 1 = 10.
     * Thus, the result should be [1,0].
     */
    public int[] plusOne(int[] digits) {
        int[] result;
        boolean check = isAllNines(digits);
        if (check) {
            result = new int[digits.length + 1];
        } else {
            result = new int[digits.length];
        }

        int forget = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] == 9) {
                    if (check) {
                        result[i + 1] = 0;
                        forget = 1;
                    } else {
                        result[i] = 0;
                        forget = 1;
                    }
                } else {
                    result[i] = digits[i] + 1;
                    forget = 0;
                }
            } else {
                if (digits[i] == 9) {
                    if (check) {
                        if(forget == 1){
                            result[i + 1] = 0;
                            forget = 1;
                        }
                    } else {
                        if(forget == 1) {
                            result[i + 1] = 0;
                            forget = 1;
                        } else {
                            result[i] = digits[i];
                        }
                    }
                } else {
                    if (forget == 1) {
                        result[i] = digits[i] + 1;
                        forget = 0;
                    } else {
                        result[i] = digits[i];
                    }
                }
            }
        }

        if(check){
            result[0] = 1;
        }

        return result;
    }

    public boolean isAllNines(int[] arr) {
        for (int num : arr) {
            if (num != 9) {
                return false;
            }
        }
        return true;
    }

    public int[] plusOneV2(int[] digits){
        int length = digits.length;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOneV2(digits);
        System.out.println(result);
    }
}

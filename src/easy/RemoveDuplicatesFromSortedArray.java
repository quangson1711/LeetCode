package easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int finalI = i;
            if (list.stream().anyMatch(line -> line == nums[finalI])) {
                //nums.
            } else {
                list.add(nums[i]);
                count++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return count;
    }

    public int removeDuplicates1(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {-3, -1, 0, 0, 0, 3, 3};
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates1(nums));
    }
}

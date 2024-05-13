package easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] == target){
                pos = i ;
                return pos;
            } else if (nums[i] < target){
                pos++;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.println(searchInsertPosition.searchInsert(nums, 7));
    }
}

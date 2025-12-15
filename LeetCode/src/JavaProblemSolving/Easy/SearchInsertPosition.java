package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 35. Search Insert Position
 * Topic : Array, Binary Search
 *
 * Started : 2025-12-15
 * Solved : 2025-12-
 * Time: -
 * Algorithm: Binary Search
 *
 *
 *
 */

public class SearchInsertPosition {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while(left < right) {
            mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if(left >= right) {
            return left;
        } else {
            return left;
        }
    }
}

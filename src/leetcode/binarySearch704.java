package src.leetcode;

public class binarySearch704 {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        //  if(nums[mid] == target) return mid;
        while (high >= low) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
//    int x = Arrays.binarySearch(nums,target);
//        return (x < 0 ? -1 : x);
}

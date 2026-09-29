class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int pivot = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid  + 1;
            } else if (nums[mid] == nums[right]){
                pivot = mid;
                break;
            } else {
                right = mid;
            }
        }

        int result = -1;

        if (target > nums[nums.length - 1]) {
            result = binarySearch(nums, target, 0, pivot - 1);
        } else if (target < nums[nums.length - 1]) {
            result = binarySearch(nums, target, pivot, nums.length - 1);
        } else {
            return nums.length - 1;
        }

        return result;
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}

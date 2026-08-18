class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        //fill all elements to 1 by default
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);

        for (int i = 1; i < nums.length; i++) {
            // nums: [1,2,4,6]
            // prefix: [1,1,2,8]
            // suffix: [48,24,6,1]
            // We recognize that prefix[i] = prefix[i-1] * nums[i-1]
            // For example: prefix[8] = prefix[2] * nums[4];
            // Same with suffix but reverse
            prefix[i] = prefix[i - 1] * nums[i - 1];
            suffix[nums.length-i-1] = suffix[nums.length-i] * nums[nums.length-i];
        }

        // For each element, the result will equal to the product of prefix and suffix at the same index
        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;
    }
}  

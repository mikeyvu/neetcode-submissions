class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int i = 0;
        for (int n = 0; n < count.length; n++) {
            int j = 0;
            while (j < count[n]) {
                nums[i] = n;
                j++;
                i++;
            }
        }
    }
}
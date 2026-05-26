class Solution {
    public int climbStairs(int n) {
        int i = 3;
        if (n <= i) {
            return n;
        }
        int[] cache = {1,2};

        while (i <= n) {
            int temp = cache[0];
            cache[0] = cache[1];
            cache[1] = cache[0] + temp;
            i++;
        }

        return cache[1];
    }
}
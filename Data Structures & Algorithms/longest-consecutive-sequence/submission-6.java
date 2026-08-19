class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxStreak = 0;
        for (Integer item : set) {
            if (!set.contains(item - 1)) {
                int currStreak = 1;
                int currNum = item;

                while (set.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }

                maxStreak = Math.max(maxStreak, currStreak);
            }
        }

        return maxStreak;
    }
}

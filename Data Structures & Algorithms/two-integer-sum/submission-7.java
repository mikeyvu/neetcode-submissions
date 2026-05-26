class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            ArrayList indexArray = map.get(nums[i]);
            if (indexArray == null) {
                indexArray = new ArrayList<Integer>();
            } 
            indexArray.add(i);
            map.put(nums[i], indexArray);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            if (map.get(leftover) == null) {
                continue;
            }
            if (map.get(leftover).get(0) == i) {
                if (map.get(leftover).size() > 1) {
                    result = new int[]{i, map.get(leftover).get(1)};
                    return result;
                }
            } else { 
                result = new int[]{i, map.get(leftover).get(0)};
                return result;
            }
        }

        return new int[]{-1, -1};
    }
}

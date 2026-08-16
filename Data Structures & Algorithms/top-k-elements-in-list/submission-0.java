class Solution {
    private HashMap<Integer, Integer> freq = new HashMap<>();

    public int[] topKFrequent(int[] nums, int k) {
        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }    

        List<Map.Entry<Integer,Integer>> freqList = new ArrayList<>(freq.entrySet());

        freqList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            results[i] = freqList.get(i).getKey();
        }

        return results;
    }
}

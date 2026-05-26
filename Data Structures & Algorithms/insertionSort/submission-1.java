// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> results = new ArrayList<>();
        if (pairs == null || pairs.isEmpty()) {
            return results;   // return []
        }
        results.add(new ArrayList<>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            int j = i - 1;
            while (j >= 0 && pairs.get(j).key > pairs.get(j+1).key) {
                Pair tempPair = pairs.get(j);
                pairs.set(j, pairs.get(j+1));
                pairs.set(j+1, tempPair);
                j--;
            }
            results.add(new ArrayList<>(pairs));
        }
        return results;
    }
}

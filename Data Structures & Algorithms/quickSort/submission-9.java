// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        if (pairs.size() <= 1) {
            return pairs;
        }
        int rightPivot = pairs.size() - 1;
        int leftPointer = 0;
        Pair temp;

        for (int i = 0; i < pairs.size(); i++) {
            if (pairs.get(i).key < pairs.get(rightPivot).key) {
                temp = pairs.get(leftPointer);
                pairs.set(leftPointer, pairs.get(i));
                pairs.set(i, temp);
                leftPointer++;
            }
        }

        temp = pairs.get(leftPointer);
        pairs.set(leftPointer, pairs.get(rightPivot));
        pairs.set(rightPivot, temp);

        quickSort(pairs.subList(0, leftPointer));
        quickSort(pairs.subList(leftPointer + 1, pairs.size()));

        return pairs;
    }
}

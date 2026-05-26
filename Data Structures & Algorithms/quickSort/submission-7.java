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
        int insertPointer = 0;
        int pivot = pairs.size() - 1;
        Pair temp;
        for (int i = 0; i < pairs.size() - 1; i++) {
            if (pairs.get(i).key < pairs.get(pivot).key) {
                temp = pairs.get(insertPointer);
                pairs.set(insertPointer, pairs.get(i));
                pairs.set(i, temp);
                insertPointer++;
            } 
        }
        temp = pairs.get(insertPointer);
        pairs.set(insertPointer, pairs.get(pivot));
        pairs.set(pivot, temp);

        quickSort(pairs.subList(0, insertPointer));
        quickSort(pairs.subList(insertPointer + 1, pairs.size()));

        return pairs;
    }
}

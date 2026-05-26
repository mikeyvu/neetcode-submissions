class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        if (pairs.size() <= 1) {
            return pairs;
        }

        int mid = pairs.size() / 2;
        List<Pair> left = new ArrayList<>(pairs.subList(0, mid));
        List<Pair> right = new ArrayList<>(pairs.subList(mid, pairs.size()));
        left = mergeSort(left);
        right = mergeSort(right);

        pairs = merge(pairs, left, right);

        return pairs;
    }

    public List<Pair> merge(List<Pair> pairs, List<Pair> left, List<Pair> right) {
        int leftPointer = 0;
        int rightPointer = 0;
        for (int i = 0; i < pairs.size(); i++) {
            if (leftPointer < left.size() && (rightPointer >= right.size() || left.get(leftPointer).key <= right.get(rightPointer).key)) {
                pairs.set(i, left.get(leftPointer));
                leftPointer++;
            } else {
                pairs.set(i, right.get(rightPointer));
                rightPointer++;
            }
        }
        return pairs;
    }
}
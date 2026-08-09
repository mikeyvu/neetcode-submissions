class Solution {

    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    public int lastStoneWeight(int[] stones) {
        for (int stone: stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            int remaining = x - y;
            if (Math.abs(remaining) != 0) {
                maxHeap.add(Math.abs(remaining));
            } 
        }

        if (maxHeap.size() == 1) {
            return maxHeap.peek();
        } else {
            return 0;
        }
    }
}

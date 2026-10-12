class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(counter.get(b), counter.get(a))
        );
        pq.addAll(counter.keySet());

        var result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}

class Solution {

    private class Node {
        private int diff;
        private int index;

        public Node(int index, int diff) {
            this.diff = diff;
            this.index = index;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> (a.diff == b.diff) ? b.index - a.index : b.diff - a.diff);
        
        for (int i = 0; i < arr.length; i++) {
            pq.offer(new Node(i, Math.abs(x - arr[i])));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(arr[pq.poll().index]);
        }

        Collections.sort(ans);
        return ans;

    }
}

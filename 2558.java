class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts)
            pq.add(i);

        while(k > 0){
            int a = pq.poll();
            int b = (int)(Math.sqrt(a));
            pq.add(b);
            k--;
        }
        long ans = 0;
        while(!pq.isEmpty())
            ans+=pq.poll();
        
        return ans;
    }
}

class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    Integer ans;

    public SmallestInfiniteSet() {
        ans = 1;
        pq = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if(!pq.isEmpty())
            return pq.poll();
        ans++;
        return ans - 1;
    }
    
    public void addBack(int num) {
        if(num < ans && !pq.contains(num))
            pq.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

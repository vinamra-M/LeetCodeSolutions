class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.offer(stone);
        }
        while(pq.size() > 1)
        {
            int x = pq.poll();
            int y = pq.poll();

            if(x!=y){
                pq.offer(x-y);
            }
        }

        if(pq.isEmpty()){
            return 0;
        }
        else{
            return pq.poll();
        }
        
    }
}

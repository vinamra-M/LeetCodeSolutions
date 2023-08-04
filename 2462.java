class Solution {
    public long totalCost(int[] costs, int hire, int cand) {
        long ans = 0;
        int i = 0;
        int k = costs.length-1;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int j = 0; j < cand; j++){
            System.out.print(costs[j]);
            pq.offer((long)costs[j]);
            i++;
        }
        System.out.println();
        PriorityQueue<Long> pq2 = new PriorityQueue<>();
        for(int j = costs.length-1; j >= costs.length - cand;j--){
            if(i > k) break;
            pq2.offer((long)costs[j]);
            System.out.print(costs[j]);
            k--;
        }
        System.out.println();
        while(hire > 0){
            if(pq.peek() == null){
                ans+=pq2.poll();
                System.out.println(ans);
                hire--;
            }
            else if(pq2.peek() == null){
                ans+=pq.poll();
                System.out.println(ans);
                hire--;
            }
            else if(pq.peek() <= pq2.peek()){
                ans += pq.poll();
                System.out.println(ans);
                if(i <= k){
                    pq.offer((long)costs[is]);
                    i++;
                }
                hire--;
            }
            else{
                ans+=pq2.poll();
                System.out.println(ans);
                if(i <= k){
                    pq2.offer((long)costs[k]);
                    k--;
                }
                hire--;
            }
        }
        return ans;
    }
}

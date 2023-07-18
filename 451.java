class Solution {
    public String frequencySort(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.val - a.val);
        for(Map.Entry<Character,Integer> entry: map.entrySet()) {
            Pair pair = new Pair(entry.getKey(),entry.getValue());
            pq.add(pair);
        }
        StringBuilder sb = new StringBuilder("");

        while(!pq.isEmpty()){
            Pair pair = pq.remove();
            int count = pair.val;
            char ch = pair.c;
            while(count > 0){
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();       
    }

     public class Pair {
        int val;
        char c;
        public Pair(char c,int val) {
            this.c = c;
            this.val = val;
        }
    }
}

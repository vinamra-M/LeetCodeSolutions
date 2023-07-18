class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();

        int ans = num;

        while(num > 0){
            int curr = num%10;
            if(curr%2 == 1) odd.add(curr);
            else even.add(curr);
            num/=10;
        }

        StringBuilder sb = new StringBuilder();
        num = ans;
        while(num > 0){
            int curr = num%10;
            if(curr%2 == 1) sb.insert(0,odd.poll());
            else sb.insert(0,even.poll());
            num/=10;
        }
        return Integer.parseInt(sb.toString());
    }
}

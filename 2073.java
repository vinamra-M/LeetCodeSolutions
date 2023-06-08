class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int len = tickets.length;
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < len; i++){
            que.add(i);
        }
        int turn = 0;
        int time = 0;
        while(tickets[k] != 0){
            if(tickets[turn] != 0){
            tickets[turn]-=1;
            if(tickets[turn] == 0){
                que.remove();
            }
            time++;
        }
        if(turn == len-1){
            turn = 0;
        }
        else{
            turn++;
        }
    }
    return time;
}
}

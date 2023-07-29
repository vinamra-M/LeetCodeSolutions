class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R') rad.add(i);
            else dire.add(i);
        }

        while(!rad.isEmpty() && !dire.isEmpty()){
            int r = rad.poll();
            int d = dire.poll();
            if(r < d) rad.add(r+senate.length());
            else dire.add(d+senate.length());
        }

        if(rad.isEmpty())
            return "Dire";
        else
            return "Radiant";
        
    }
}

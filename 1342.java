class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
        
    }

    public int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        else if(num%2 == 0){
            steps++;
            return helper(num/2,steps);
        }
        else{
            steps++;
            return helper(num-1,steps);
        }
    }
    
}

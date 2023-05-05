class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int len = salary.length;
        int sum = 0;
        for(int i = 1; i < len-1; i++){
            sum+=salary[i];
        }
        return (double)sum/(len-2);
        
    }
}

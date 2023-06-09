class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] == 1) {
                one++;
            }
            else{
                zero++;
            }
        }
        System.out.println(zero);
        System.out.println(one);
        for(int i = 0; i < sandwiches.length; i++){
            if(sandwiches[i] == 0){
                if(zero == 0) {
                    return one;
                }
                zero--;
            }
            if(sandwiches[i] == 1){
                if(one == 0) {
                    return zero;
                }
                one--;
            }
        }
        return 0;
        
    }
}

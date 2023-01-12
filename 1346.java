class Solution {
    public boolean checkIfExist(int[] arr) {
        int s = 0;
        int e = 1;
        while(s < arr.length - 1){
            if(arr[s] == 2 * arr[e] || arr[e] == 2 * arr[s]){
                return true;
            }
            else if(e == arr.length - 1){
                s = s + 1;
                e = s + 1;
            }
            else{
                e+=1;
            }
        }
        return false;
        
    }
}

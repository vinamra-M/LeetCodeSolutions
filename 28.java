class Solution {
    public int strStr(String haystack, String needle) {
        int a = needle.length();
        int b = haystack.length();
        
        for(int i = 0; i < b-a+1; i++){
            boolean ans = true;
                for(int j = 0; j  < a; j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        ans = false;
                        break;
                    }
                }
            
            if(ans){
                return i;
            }
        }
        return -1;
        
    }
}

//I was trying to reduce iterations by first comparing the 0 index letter in haystack
//but this was giving some error, couldn't figure out what.

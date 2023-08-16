class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = 0;
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            int left = i;
            int right = i;
            while(left >= 0 && arr[left] == ch) left--;
            while(right < arr.length && arr[right] == ch) right++;
            while(left >= 0 && right < arr.length){
                if(arr[left] != arr[right]) break;
                left--;
                right++;
            }
            left += 1;
            right -=1;
            if(end-start < right - left){
                start= left;
                end = right;
            }
            
        }
        return s.substring(start,end+1);
    }
}

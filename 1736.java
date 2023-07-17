class Solution {
    public String maximumTime(String time) {
        char[] arr = time.toCharArray();
        if(arr[3] == '?') arr[3] = '5';
        if(arr[4] == '?') arr[4] = '9';
        if(arr[0] == '?'){
            if(arr[1] != '?' && arr[1] - '0' > 3){
                arr[0] = '1';
            }
            else{
                arr[0] = '2';
            }
        }
        if(arr[1] == '?'){
            if(arr[0] == '1' || arr[0] == '0'){
                arr[1] = '9';
            }
            else{
                arr[1] = '3';
            }
        }
        String string = new String(arr);
        return string;
    }
}

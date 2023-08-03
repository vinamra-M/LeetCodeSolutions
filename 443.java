class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int n = chars.length;
        if(n == 1) return 1;

        while(i < n){
            int count = 1;
            char c = chars[i];
            while(i+1 < n && chars[i+1] == c){
                count++;
                i++;
            } 
            if(count == 1) chars[j++] = c;
            else{
                chars[j++] = c;
                String total = count+"";
                for(int k = 0; k < total.length(); k++) chars[j++] = total.charAt(k);
            }
            i++;
        }
        return j;
    }
}
